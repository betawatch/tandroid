package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import com.google.gson.internal.TroubleshootingGuide;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class ReflectionHelper {
    private static final RecordHelper RECORD_HELPER;

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (ReflectiveOperationException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        RECORD_HELPER = recordNotSupportedHelper;
    }

    private static String getInaccessibleTroubleshootingSuffix(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + TroubleshootingGuide.createUrl(str);
        }
        return "";
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String accessibleObjectDescription = getAccessibleObjectDescription(accessibleObject, false);
            throw new JsonIOException("Failed making " + accessibleObjectDescription + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + getInaccessibleTroubleshootingSuffix(e), e);
        }
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            appendExecutableParameters(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        appendExecutableParameters(constructor, sb);
        return sb.toString();
    }

    private static void appendExecutableParameters(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        return !isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + getInaccessibleTroubleshootingSuffix(e);
        }
    }

    public static boolean isRecord(Class<?> cls) {
        return RECORD_HELPER.isRecord(cls);
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return RECORD_HELPER.getRecordComponentNames(cls);
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return RECORD_HELPER.getAccessor(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return RECORD_HELPER.getCanonicalRecordConstructor(cls);
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    /* loaded from: classes.dex */
    private static abstract class RecordHelper {
        public abstract Method getAccessor(Class<?> cls, Field field);

        abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls);

        abstract String[] getRecordComponentNames(Class<?> cls);

        abstract boolean isRecord(Class<?> cls);

        private RecordHelper() {
        }
    }

    /* loaded from: classes.dex */
    private static class RecordSupportedHelper extends RecordHelper {
        private final Method getName;
        private final Method getRecordComponents;
        private final Method getType;
        private final Method isRecord;

        private RecordSupportedHelper() throws NoSuchMethodException, ClassNotFoundException {
            super();
            this.isRecord = Class.class.getMethod("isRecord", null);
            this.getRecordComponents = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.getName = cls.getMethod("getName", null);
            this.getType = cls.getMethod("getType", null);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(Class<?> cls) {
            try {
                return ((Boolean) this.isRecord.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] getRecordComponentNames(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.getName.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.getType.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class RecordNotSupportedHelper extends RecordHelper {
        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(Class<?> cls) {
            return false;
        }

        private RecordNotSupportedHelper() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] getRecordComponentNames(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }
}
