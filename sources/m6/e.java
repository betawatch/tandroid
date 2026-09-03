package m6;

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
import b6.m;
import com.google.android.gms.common.api.internal.o1;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public static final ab.a b;
    public static final cb.b c;
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static final ThreadLocal i = new ThreadLocal();
    public static final o1 j = new o1(2);
    public static final z9.d k = new z9.d(11);
    public static j l;
    public static k m;
    public final Context a;

    static {
        int i10 = 12;
        b = new ab.a(i10);
        c = new cb.b(i10);
    }

    public e(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (m.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j10;
        e eVar;
        Boolean bool;
        l6.a U0;
        e eVar2;
        k kVar;
        boolean z4;
        l6.a U02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = i;
        i iVar = (i) threadLocal.get();
        i iVar2 = new i();
        threadLocal.set(iVar2);
        o1 o1Var = j;
        Long l10 = (Long) o1Var.get();
        long longValue = l10.longValue();
        try {
            o1Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            e8.a k10 = dVar.k(context, str, k);
            j10 = longValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + k10.a + " and remote module " + str + ":" + k10.b);
                int i10 = k10.c;
                if (i10 != 0) {
                    if (i10 == -1) {
                        if (k10.a != 0) {
                            i10 = -1;
                        }
                    }
                    if (i10 != 1 || k10.b != 0) {
                        if (i10 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            eVar = new e(applicationContext);
                        } else {
                            if (i10 != 1) {
                                throw new b("VersionPolicy returned invalid code:" + i10);
                            }
                            try {
                                int i11 = k10.b;
                                try {
                                    synchronized (e.class) {
                                        if (!g(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        bool = d;
                                    }
                                    if (bool == null) {
                                        throw new b("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                        synchronized (e.class) {
                                            kVar = m;
                                        }
                                        if (kVar == null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        i iVar3 = (i) threadLocal.get();
                                        if (iVar3 == null || iVar3.a == null) {
                                            throw new b("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = iVar3.a;
                                        new l6.b(null);
                                        synchronized (e.class) {
                                            z4 = g >= 2;
                                        }
                                        if (z4) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            U02 = kVar.V0(new l6.b(applicationContext2), str, i11, new l6.b(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            U02 = kVar.U0(new l6.b(applicationContext2), str, i11, new l6.b(cursor));
                                        }
                                        Context context2 = (Context) l6.b.K0(U02);
                                        if (context2 == null) {
                                            throw new b("Failed to get module context");
                                        }
                                        eVar2 = new e(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                        j h9 = h(context);
                                        if (h9 == null) {
                                            throw new b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel K0 = h9.K0(h9.M0(), 6);
                                        int readInt = K0.readInt();
                                        K0.recycle();
                                        if (readInt >= 3) {
                                            i iVar4 = (i) threadLocal.get();
                                            if (iVar4 == null) {
                                                throw new b("No cached result cursor holder");
                                            }
                                            U0 = h9.V0(new l6.b(context), str, i11, new l6.b(iVar4.a));
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            U0 = h9.W0(new l6.b(context), str, i11);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            U0 = h9.U0(new l6.b(context), str, i11);
                                        }
                                        Object K02 = l6.b.K0(U0);
                                        if (K02 == null) {
                                            throw new b("Failed to load remote module.");
                                        }
                                        eVar2 = new e((Context) K02);
                                    }
                                    eVar = eVar2;
                                } catch (RemoteException e6) {
                                    throw new b("Failed to load remote module.", e6);
                                } catch (b e10) {
                                    throw e10;
                                } catch (Throwable th2) {
                                    throw new b("Failed to load remote module.", th2);
                                }
                            } catch (b e11) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e11.getMessage());
                                int i12 = k10.a;
                                if (i12 == 0 || dVar.k(context, str, new c5.c(i12)).c != -1) {
                                    throw new b("Remote load failed. No local fallback found.", e11);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            }
                        }
                        if (j10 == 0) {
                            j.remove();
                        } else {
                            j.set(l10);
                        }
                        Cursor cursor2 = iVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        i.set(iVar);
                        return eVar;
                    }
                }
                throw new b("No acceptable module " + str + " found. Local version is " + k10.a + " and remote version is " + k10.b + ".");
            } catch (Throwable th3) {
                th = th3;
                if (j10 == 0) {
                    j.remove();
                } else {
                    j.set(l10);
                }
                Cursor cursor3 = iVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                i.set(iVar);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j10 = longValue;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017d, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z4) {
        Field declaredField;
        Throwable th2;
        RemoteException remoteException;
        int readInt;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = d;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e6) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e6.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e10 = e(context, str, z4, true);
                                        String str2 = e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a2 = g.a();
                                            if (a2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    a.b();
                                                    String str3 = e;
                                                    m.h(str3);
                                                    a2 = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = e;
                                                    m.h(str4);
                                                    a2 = new h(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(a2);
                                            declaredField.set(null, a2);
                                            d = bool2;
                                            return e10;
                                        }
                                        return e10;
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
                        return e(context, str, z4, false);
                    } catch (b e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                j h9 = h(context);
                try {
                    if (h9 == null) {
                        return 0;
                    }
                    try {
                        Parcel K0 = h9.K0(h9.M0(), 6);
                        int readInt2 = K0.readInt();
                        K0.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = i;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) l6.b.K0(h9.X0(new l6.b(context), str, z4, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.a != null) {
                                                z10 = false;
                                            } else {
                                                iVar2.a = cursor3;
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
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
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
                            l6.b bVar = new l6.b(context);
                            Parcel M0 = h9.M0();
                            a7.d.c(M0, bVar);
                            M0.writeString(str);
                            M0.writeInt(z4 ? 1 : 0);
                            Parcel K02 = h9.K0(M0, 5);
                            readInt = K02.readInt();
                            K02.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            l6.b bVar2 = new l6.b(context);
                            Parcel M02 = h9.M0();
                            a7.d.c(M02, bVar2);
                            M02.writeString(str);
                            M02.writeInt(z4 ? 1 : 0);
                            Parcel K03 = h9.K0(M02, 3);
                            readInt = K03.readInt();
                            K03.recycle();
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0135, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Context context, String str, boolean z4, boolean z10) {
        Throwable th2;
        Exception exc;
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z11;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z12 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
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
                            for (int i10 = 0; i10 < count; i10++) {
                                if (!query.moveToPosition(i10)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i11 = 0; i11 < columnCount; i11++) {
                                    int type = query.getType(i11);
                                    if (type == 0) {
                                        objArr[i11] = null;
                                    } else if (type == 1) {
                                        objArr[i11] = Long.valueOf(query.getLong(i11));
                                    } else if (type == 2) {
                                        objArr[i11] = Double.valueOf(query.getDouble(i11));
                                    } else if (type == 3) {
                                        objArr[i11] = query.getString(i11);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i11] = query.getBlob(i11);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i12 = matrixCursor.getInt(0);
                                        if (i12 > 0) {
                                            synchronized (e.class) {
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
                                            i iVar = (i) i.get();
                                            if (iVar == null || iVar.a != null) {
                                                z12 = false;
                                            } else {
                                                iVar.a = matrixCursor;
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
                                        return i12;
                                    }
                                } catch (Exception e6) {
                                    exc = e6;
                                    if (exc instanceof b) {
                                        throw exc;
                                    }
                                    throw new b("V2 version check failed: " + exc.getMessage(), exc);
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
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Throwable th7) {
            th2 = th7;
        }
    }

    public static void f(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 0);
            }
            m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new b("Failed to instantiate dynamite loader", e6);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z4 = false;
        if (h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? TLObject.FLAG_28 : 0);
            if (y5.e.b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z4 = true;
            }
            h = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 0);
                }
                if (jVar != null) {
                    l = jVar;
                    return jVar;
                }
            } catch (Exception e6) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e6.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new b("Failed to instantiate module class: ".concat(str), e6);
        }
    }
}
