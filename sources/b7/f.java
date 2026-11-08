package b7;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import w7.s;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f {
    public static final sa.d b;
    public static final s c;
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static final ThreadLocal i = new ThreadLocal();
    public static final j j = new j(0);
    public static final qb.a k;
    public static m l;
    public static n m;
    public final Context a;

    static {
        int i7 = 4;
        k = new qb.a(i7);
        b = new sa.d(i7);
        c = new s(i7, false);
    }

    public f(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (q6.m.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0312 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0321 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0318 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b7.j, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f c(Context context, e eVar, String str) {
        Context context2;
        int i7;
        f fVar;
        int i10;
        a7.a x12;
        n nVar;
        boolean z9;
        a7.a x13;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = i;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k();
        threadLocal.set(kVar2);
        ?? r72 = j;
        Long l10 = (Long) r72.get();
        long longValue = l10.longValue();
        try {
            r72.set(Long.valueOf(SystemClock.uptimeMillis()));
            d f02 = eVar.f0(context, str, k);
            int i11 = f02.a;
            int i12 = f02.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i11).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i12).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            Log.i("DynamiteModule", sb2.toString());
            int i13 = f02.c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (f02.a != 0) {
                        i13 = -1;
                    }
                }
                if (i13 != 1 || f02.b != 0) {
                    if (i13 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        f fVar2 = new f(applicationContext);
                        if (longValue == 0) {
                            r72.remove();
                        } else {
                            r72.set(l10);
                        }
                        Cursor cursor = kVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(kVar);
                        return fVar2;
                    }
                    if (i13 != 1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 36);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i13);
                        throw new b(sb3.toString());
                    }
                    try {
                        try {
                            i10 = f02.b;
                        } catch (b e10) {
                            e = e10;
                            context2 = context;
                            String message = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            Log.w("DynamiteModule", sb4.toString());
                            i7 = f02.a;
                            if (i7 != 0 || eVar.f0(context2, str, new l(i7)).c != -1) {
                                throw new b("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            fVar = new f(applicationContext);
                            return fVar;
                        }
                    } catch (b e11) {
                        e = e11;
                        context2 = r72;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + 30);
                        sb42.append("Failed to load remote module: ");
                        sb42.append(message2);
                        Log.w("DynamiteModule", sb42.toString());
                        i7 = f02.a;
                        if (i7 != 0) {
                        }
                        throw new b("Remote load failed. No local fallback found.", e);
                    }
                    try {
                        try {
                            try {
                                synchronized (f.class) {
                                    try {
                                        if (!e(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        Boolean bool = d;
                                        if (bool == null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                                            sb5.append("Selected remote version of ");
                                            sb5.append(str);
                                            sb5.append(", version >= ");
                                            sb5.append(i10);
                                            Log.i("DynamiteModule", sb5.toString());
                                            synchronized (f.class) {
                                                nVar = m;
                                            }
                                            if (nVar == null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            k kVar3 = (k) threadLocal.get();
                                            if (kVar3 == null || kVar3.a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = kVar3.a;
                                            new a7.b(null);
                                            synchronized (f.class) {
                                                z9 = g >= 2;
                                            }
                                            if (z9) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                x13 = nVar.y1(new a7.b(applicationContext2), str, i10, new a7.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                x13 = nVar.x1(new a7.b(applicationContext2), str, i10, new a7.b(cursor2));
                                            }
                                            Context context3 = (Context) a7.b.n1(x13);
                                            if (context3 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            fVar = new f(context3);
                                        } else {
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                                            sb6.append("Selected remote version of ");
                                            sb6.append(str);
                                            sb6.append(", version >= ");
                                            sb6.append(i10);
                                            Log.i("DynamiteModule", sb6.toString());
                                            m h7 = h(context);
                                            if (h7 == null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel n1 = h7.n1(h7.p1(), 6);
                                            int readInt = n1.readInt();
                                            n1.recycle();
                                            if (readInt >= 3) {
                                                k kVar4 = (k) threadLocal.get();
                                                if (kVar4 == null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                x12 = h7.A1(new a7.b(context), str, i10, new a7.b(kVar4.a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                x12 = h7.y1(new a7.b(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                x12 = h7.x1(new a7.b(context), str, i10);
                                            }
                                            Object n12 = a7.b.n1(x12);
                                            if (n12 == null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            fVar = new f((Context) n12);
                                        }
                                        return fVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (RemoteException e12) {
                            e = e12;
                            throw new b("Failed to load remote module.", e);
                        } catch (b e13) {
                            throw e13;
                        } catch (Throwable th4) {
                            th = th4;
                            throw new b("Failed to load remote module.", th);
                        }
                    } catch (RemoteException e14) {
                        e = e14;
                        throw new b("Failed to load remote module.", e);
                    } catch (b e15) {
                        throw e15;
                    } catch (Throwable th5) {
                        th = th5;
                        throw new b("Failed to load remote module.", th);
                    }
                }
            }
            int i14 = f02.a;
            int i15 = f02.b;
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i14).length() + 23 + String.valueOf(i15).length() + 1);
            sb7.append("No acceptable module ");
            sb7.append(str);
            sb7.append(" found. Local version is ");
            sb7.append(i14);
            sb7.append(" and remote version is ");
            sb7.append(i15);
            sb7.append(".");
            throw new b(sb7.toString());
        } finally {
            if (longValue == 0) {
                j.remove();
            } else {
                j.set(l10);
            }
            Cursor cursor3 = kVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            i.set(kVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x018e, code lost:
    
        if (r4 != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z9) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = d;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        String obj = e10.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!e(context)) {
                                return 0;
                            }
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int f10 = f(context, str, z9, true);
                                        String str2 = e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader b10 = h.b();
                                            if (b10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = e;
                                                    q6.m.g(str3);
                                                    b10 = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = e;
                                                    q6.m.g(str4);
                                                    b10 = new i(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(b10);
                                            declaredField.set(null, b10);
                                            d = bool2;
                                            return f10;
                                        }
                                        return f10;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z9, false);
                    } catch (b e11) {
                        String message = e11.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                m h7 = h(context);
                try {
                    if (h7 == null) {
                        return 0;
                    }
                    try {
                        Parcel n1 = h7.n1(h7.p1(), 6);
                        int readInt2 = n1.readInt();
                        n1.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = i;
                            k kVar = (k) threadLocal.get();
                            if (kVar != null && (cursor = kVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) a7.b.n1(h7.z1(new a7.b(context), str, z9, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            k kVar2 = (k) threadLocal.get();
                                            if (kVar2 == null || kVar2.a != null) {
                                                z10 = false;
                                            } else {
                                                kVar2.a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e12) {
                                    remoteException = e12;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb4.append("Failed to retrieve remote module version: ");
                                    sb4.append(message2);
                                    Log.w("DynamiteModule", sb4.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            a7.b bVar = new a7.b(context);
                            Parcel p12 = h7.p1();
                            p7.g.b(p12, bVar);
                            p12.writeString(str);
                            p12.writeInt(z9 ? 1 : 0);
                            Parcel n12 = h7.n1(p12, 5);
                            readInt = n12.readInt();
                            n12.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            a7.b bVar2 = new a7.b(context);
                            Parcel p13 = h7.p1();
                            p7.g.b(p13, bVar2);
                            p13.writeString(str);
                            p13.writeInt(z9 ? 1 : 0);
                            Parcel n13 = h7.n1(p13, 3);
                            readInt = n13.readInt();
                            n13.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e13) {
                        remoteException = e13;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } finally {
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z9 = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? TLObject.FLAG_28 : 0);
            if (n6.e.b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z9 = true;
            }
            h = Boolean.valueOf(z9);
            if (z9 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & qs.N1) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z9) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Context context, String str, boolean z9, boolean z10) {
        Exception exc;
        Throwable th2;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z11;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z12 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z9 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z13 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        acquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i7 = 0; i7 < count; i7++) {
                                if (!query.moveToPosition(i7)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i10 = 0; i10 < columnCount; i10++) {
                                    int type = query.getType(i10);
                                    if (type == 0) {
                                        objArr[i10] = null;
                                    } else if (type == 1) {
                                        objArr[i10] = Long.valueOf(query.getLong(i10));
                                    } else if (type == 2) {
                                        objArr[i10] = Double.valueOf(query.getDouble(i10));
                                    } else if (type == 3) {
                                        objArr[i10] = query.getString(i10);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i10] = query.getBlob(i10);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i11 = matrixCursor.getInt(0);
                                        if (i11 > 0) {
                                            synchronized (f.class) {
                                                try {
                                                    e = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        g = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z11 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f = z11;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            k kVar = (k) i.get();
                                            if (kVar == null || kVar.a != null) {
                                                z12 = false;
                                            } else {
                                                kVar.a = matrixCursor;
                                            }
                                            z13 = z11;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z10 && z13) {
                                            throw new b("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i11;
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    if (exc instanceof b) {
                                        throw exc;
                                    }
                                    String message = exc.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                                    sb2.append("V2 version check failed: ");
                                    sb2.append(message);
                                    throw new b(sb2.toString(), exc);
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 == null) {
                                        throw th2;
                                    }
                                    matrixCursor2.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new b("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th5) {
                            try {
                                query.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th2 = th7;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public static void g(ClassLoader classLoader) {
        try {
            n nVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 9);
            }
            m = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new b("Failed to instantiate dynamite loader", e10);
        }
    }

    public static m h(Context context) {
        m mVar;
        synchronized (f.class) {
            m mVar2 = l;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 9);
                }
                if (mVar != null) {
                    l = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new b("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
