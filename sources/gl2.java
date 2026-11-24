// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gl2 implements x74, lt8, vh5, s09, kt8, xp2, zu9, kab {
    public static final is6 h = new is6(4);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public gl2(int[] iArr, int i, mu7[] mu7VarArr) {
        fl2 fl2Var;
        this.a = (byte) 0;
        this.f = new float[3];
        this.e = mu7VarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int D = (D(Color.red(i3), 8, 5) << 10) | (D(Color.green(i3), 8, 5) << 5) | D(Color.blue(i3), 8, 5);
            iArr[i2] = D;
            iArr2[D] = iArr2[D] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb(D((i5 >> 10) & 31, 5, 8), D((i5 >> 5) & 31, 5, 8), D(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                bm2.c(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (P(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.d = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.d).add(new ou7(Color.rgb(D((i9 >> 10) & 31, 5, 8), D((i9 >> 5) & 31, 5, 8), D(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, h);
        priorityQueue.offer(new fl2(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i && (fl2Var = (fl2) priorityQueue.poll()) != null) {
            int i10 = fl2Var.b;
            int i11 = fl2Var.a;
            if ((i10 + 1) - i11 <= 1) {
                break;
            }
            gl2 gl2Var = fl2Var.j;
            if ((i10 + 1) - i11 <= 1) {
                sc8.j("Can not split a box with only 1 color");
                throw null;
            }
            int i12 = fl2Var.e - fl2Var.d;
            int i13 = fl2Var.g - fl2Var.f;
            int i14 = fl2Var.i - fl2Var.h;
            int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) gl2Var.b;
            int[] iArr5 = (int[]) gl2Var.c;
            B(i15, i11, i10, iArr4);
            Arrays.sort(iArr4, i11, fl2Var.b + 1);
            B(i15, i11, fl2Var.b, iArr4);
            int i16 = fl2Var.c / 2;
            int i17 = 0;
            int i18 = i11;
            while (true) {
                int i19 = fl2Var.b;
                if (i18 > i19) {
                    break;
                }
                i17 += iArr5[iArr4[i18]];
                if (i17 >= i16) {
                    i11 = Math.min(i19 - 1, i18);
                    break;
                }
                i18++;
            }
            fl2 fl2Var2 = new fl2(gl2Var, i11 + 1, fl2Var.b);
            fl2Var.b = i11;
            fl2Var.a();
            priorityQueue.offer(fl2Var2);
            priorityQueue.offer(fl2Var);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            fl2 fl2Var3 = (fl2) it.next();
            gl2 gl2Var2 = fl2Var3.j;
            int[] iArr6 = (int[]) gl2Var2.b;
            int[] iArr7 = (int[]) gl2Var2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = fl2Var3.a; i24 <= fl2Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            ou7 ou7Var = new ou7(Color.rgb(D(Math.round(i20 / f), 5, 8), D(Math.round(i22 / f), 5, 8), D(Math.round(i23 / f), 5, 8)), i21);
            if (!P(ou7Var.b())) {
                arrayList.add(ou7Var);
            }
        }
        this.d = arrayList;
    }

    public static void B(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5) | (i4 & 31);
                i2++;
            }
            return;
        }
        if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5) | ((i5 >> 10) & 31);
                i2++;
            }
        }
    }

    public static int D(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static void S(gl2 gl2Var, xhf xhfVar) {
        mhf T;
        byte b = xhfVar.e;
        if (b == 2 && ((mhf) gl2Var.e) != null) {
            gl2Var.U();
        }
        if (b == 2) {
            T = new mhf((h6e) gl2Var.b, (String) gl2Var.d);
            gl2Var.e = T;
        } else {
            T = gl2Var.T();
            gl2Var.e = T;
        }
        fre.h(T);
        xhfVar.d = T.h;
        T.b.add(xhfVar);
    }

    public static Exception v(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    @Override // s09
    public final boolean C() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i, int i2, Intent intent) {
        FileOutputStream fileOutputStream;
        crc crcVar = (crc) this.e;
        if (i2 == -1) {
            ?? r10 = 10;
            FileOutputStream fileOutputStream2 = null;
            if (i != 10) {
                if (i != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.f = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                    Point b1 = gl.b1();
                    Bitmap G = fl5.G(null, intent.getData(), (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) this.f));
                    crcVar.b((File) this.f, G, false);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            gl.e((String) this.b);
            try {
                try {
                    this.f = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                    Point b12 = gl.b1();
                    Bitmap G2 = fl5.G((String) this.b, null, (float) b12.x, (float) b12.y, true);
                    fileOutputStream = new FileOutputStream((File) this.f);
                    try {
                        G2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        crcVar.b((File) this.f, G2, false);
                        r10 = fileOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        fa4.g(e, true);
                        r10 = fileOutputStream;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = r10;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                r10.close();
            } catch (Exception e5) {
                fa4.g(e5, true);
            }
            this.b = null;
        }
    }

    public final void G() {
        st stVar = (st) this.b;
        eq2 eq2Var = (eq2) stVar.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            eq2Var.getClass();
            eq2Var.A(new d2d(eq2Var, (byte) 0));
            if (((vk9) eq2Var.a) == null) {
                eq2.y(stVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void H() {
        eq2 eq2Var = (eq2) ((st) this.b).b;
        vk9 vk9Var = (vk9) eq2Var.a;
        if (vk9Var == null) {
            while (!((LinkedList) eq2Var.b).isEmpty() && ((d2d) ((LinkedList) eq2Var.b).getLast()).a() >= 1) {
                ((LinkedList) eq2Var.b).removeLast();
            }
        } else {
            try {
                kwe kweVar = (kwe) vk9Var.c;
                kweVar.V(kweVar.R(), 5);
            } catch (RemoteException e) {
                fvc.g(e);
            }
        }
    }

    public final void I() {
        eq2 eq2Var = (eq2) ((st) this.b).b;
        vk9 vk9Var = (vk9) eq2Var.a;
        if (vk9Var == null) {
            while (!((LinkedList) eq2Var.b).isEmpty() && ((d2d) ((LinkedList) eq2Var.b).getLast()).a() >= 5) {
                ((LinkedList) eq2Var.b).removeLast();
            }
        } else {
            try {
                kwe kweVar = (kwe) vk9Var.c;
                kweVar.V(kweVar.R(), 4);
            } catch (RemoteException e) {
                fvc.g(e);
            }
        }
    }

    public final void J() {
        eq2 eq2Var = (eq2) ((st) this.b).b;
        eq2Var.getClass();
        eq2Var.A(new d2d(eq2Var, (byte) 1));
    }

    public final void K() {
        WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.d;
        if (wallpapersListActivity == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) this.c).startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        if (parentActivity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                    return;
                }
            } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        g48 g48Var = new g48(2, false, false, null);
        g48Var.y = false;
        g48Var.W = new g29((Object) this, (byte) 21);
        wallpapersListActivity.presentFragment(g48Var);
    }

    public final void L(String str, String... strArr) {
        Bundle bundle = (Bundle) this.b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            t4f.a("String array is empty and is ignored by put method.");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
            String str2 = strArr2[i2];
            strArr2[i] = str2;
            if (strArr2[i2] == null) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("String at ");
                sb.append(i2);
                sb.append(" is null and is ignored by put method.");
                t4f.a(sb.toString());
            } else {
                int i3 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("String at ");
                    sb2.append(i2);
                    sb2.append(" is too long, truncating string.");
                    t4f.a(sb2.toString());
                    String str3 = strArr2[i];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i3 = 19999;
                        }
                        str3 = str3.substring(0, i3);
                    }
                    strArr2[i] = str3;
                }
                i++;
            }
        }
        if (i > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
            if (objArr.length >= 100) {
                t4f.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Task M() {
        Task forException;
        int i;
        boolean w = w();
        final byte b = 0;
        Object[] objArr = 0;
        final byte b2 = 1;
        if (w && ((kd7) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new kn7("Firebase-Messaging-Network-Io"));
            return ((qg4) ((rg4) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: yx4
                public final /* synthetic */ gl2 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b2;
                    ExecutorService executorService = newSingleThreadExecutor;
                    gl2 gl2Var = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(gl2.v(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            jg4 jg4Var = (jg4) gl2Var.c;
                            jg4Var.a();
                            xg4 xg4Var = jg4Var.c;
                            String str3 = xg4Var.a;
                            jg4Var.a();
                            k59 k59Var = new k59(kd7.b(jg4Var), xg4Var.b, str3, str, str2);
                            u84 u84Var = (u84) gl2Var.b;
                            agb b4 = bgb.b();
                            b4.c = new f84[]{ohd.a};
                            b4.a = new v8b(u84Var, k59Var, false, (byte) 18);
                            b4.d = (char) 39001;
                            return u84Var.e(0, b4.a()).continueWith(executorService, new zx4(str, (byte) 0));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(gl2.v(task)) : ((qg4) ((rg4) gl2Var.d)).e().continueWithTask(executorService, new zx4(gl2Var, ((x90) task.getResult()).a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: yx4
                public final /* synthetic */ gl2 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b;
                    ExecutorService executorService = newSingleThreadExecutor;
                    gl2 gl2Var = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(gl2.v(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            jg4 jg4Var = (jg4) gl2Var.c;
                            jg4Var.a();
                            xg4 xg4Var = jg4Var.c;
                            String str3 = xg4Var.a;
                            jg4Var.a();
                            k59 k59Var = new k59(kd7.b(jg4Var), xg4Var.b, str3, str, str2);
                            u84 u84Var = (u84) gl2Var.b;
                            agb b4 = bgb.b();
                            b4.c = new f84[]{ohd.a};
                            b4.a = new v8b(u84Var, k59Var, false, (byte) 18);
                            b4.d = (char) 39001;
                            return u84Var.e(0, b4.a()).continueWith(executorService, new zx4(str, (byte) 0));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(gl2.v(task)) : ((qg4) ((rg4) gl2Var.d)).e().continueWithTask(executorService, new zx4(gl2Var, ((x90) task.getResult()).a));
                    }
                }
            });
        }
        ep epVar = (ep) this.e;
        String b3 = kd7.b((jg4) epVar.a);
        Bundle bundle = new Bundle();
        try {
            epVar.j(b3, bundle, w);
            fm9 fm9Var = (fm9) epVar.c;
            wn3 wn3Var = wn3.d;
            zgf zgfVar = fm9Var.c;
            if (zgfVar.b() >= 12000000) {
                igf t = igf.t(fm9Var.b);
                synchronized (t) {
                    i = t.a;
                    t.a = i + 1;
                }
                forException = t.u(new ebf(i, 1, bundle, (byte) 1)).continueWith(wn3Var, f6d.b);
            } else if (zgfVar.a() != 0) {
                forException = fm9Var.d(bundle).continueWithTask(wn3Var, new aec(fm9Var, bundle, objArr == true ? 1 : 0, (byte) 22));
            } else {
                forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
        } catch (InterruptedException | ExecutionException e) {
            forException = Tasks.forException(e);
        }
        return forException.continueWith(new hc(b2), new wn4(epVar));
    }

    public final void N() {
        ka3 ka3Var = (ka3) this.b;
        synchronized (ka3Var) {
            ka3Var.d = true;
        }
    }

    public final Set O(Class cls) {
        return c(xw8.a(cls));
    }

    public final boolean P(float[] fArr) {
        mu7[] mu7VarArr = (mu7[]) this.e;
        if (mu7VarArr != null && mu7VarArr.length > 0) {
            for (mu7 mu7Var : mu7VarArr) {
                mu7Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void Q(Uri uri) {
        yyd yydVar;
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            R();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        R();
        this.d = uri;
        ek5 ek5Var = (ek5) this.c;
        int i2 = ek5Var.b;
        if (i2 == 0 || (i = ek5Var.c) == 0) {
            yydVar = new yyd(context, 0, 0, this);
            this.e = yydVar;
        } else {
            yydVar = new yyd(context, i2, i, this);
            this.e = yydVar;
        }
        Uri uri2 = (Uri) this.d;
        fre.h(uri2);
        yydVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public final void R() {
        yyd yydVar = (yyd) this.e;
        if (yydVar != null) {
            yydVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    public final mhf T() {
        if (((mhf) this.e) == null) {
            mhf mhfVar = new mhf((h6e) this.b, (String) this.d);
            this.e = mhfVar;
            mhfVar.b(1);
        }
        return (mhf) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void U() {
        int i;
        w3f w3fVar;
        int i2;
        long j;
        mhf mhfVar = (mhf) this.e;
        if (mhfVar != null) {
            Map map = mhfVar.e;
            List<m9f> list = mhfVar.d;
            List<o5d> list2 = mhfVar.c;
            List<xhf> list3 = mhfVar.b;
            ed1 ed1Var = mhfVar.j;
            if (ed1Var != null) {
                ed1Var.l = null;
                mhfVar.j = null;
            }
            long j2 = mhfVar.i;
            w3f m = y3f.m();
            m.c();
            y3f.t((y3f) m.b, j2);
            String str = mhfVar.l;
            if (str != null) {
                m.c();
                y3f.y((y3f) m.b, str);
            }
            String str2 = mhfVar.m;
            if (str2 != null) {
                m.c();
                y3f.u((y3f) m.b, str2);
            }
            f3f l = i3f.l();
            String str3 = mhf.o;
            l.c();
            i3f.n((i3f) l.b, str3);
            String str4 = mhfVar.g;
            l.c();
            i3f.m((i3f) l.b, str4);
            i3f i3fVar = (i3f) l.a();
            m.c();
            y3f.r((y3f) m.b, i3fVar);
            yv2 yv2Var = mhfVar.a;
            j4f l2 = l4f.l();
            Object zza = yv2Var.zza();
            if (zza != null) {
                f6f l3 = h6f.l();
                l3.c();
                h6f.m((h6f) l3.b, (String) zza);
                h6f h6fVar = (h6f) l3.a();
                l2.c();
                l4f.m((l4f) l2.b, h6fVar);
            }
            String str5 = mhfVar.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    dc6 dc6Var = mhf.n;
                    Log.w(dc6Var.a, dc6Var.d("receiverSessionId %s is not valid for hash", str5), e);
                    j = 0;
                }
                l2.c();
                l4f.n((l4f) l2.b, j);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (xhf xhfVar : list3) {
                    xhfVar.getClass();
                    f4f l4 = h4f.l();
                    byte b = xhfVar.e;
                    l4.c();
                    h4f.p((h4f) l4.b, b);
                    int i3 = (int) (xhfVar.b - xhfVar.d);
                    l4.c();
                    h4f.m((h4f) l4.b, i3);
                    Integer num = xhfVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l4.c();
                        h4f.n((h4f) l4.b, intValue);
                    }
                    Boolean bool = xhfVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l4.c();
                        h4f.o((h4f) l4.b, booleanValue);
                    }
                    arrayList.add((h4f) l4.a());
                }
                l2.c();
                l4f.o((l4f) l2.b, arrayList);
            }
            int i4 = 2;
            if (list2.isEmpty()) {
                i = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (o5d o5dVar : list2) {
                    o5dVar.getClass();
                    s4f l5 = u4f.l();
                    int i5 = (int) (o5dVar.b - o5dVar.c);
                    l5.c();
                    u4f.m((u4f) l5.b, i5);
                    byte b2 = o5dVar.a;
                    int i6 = b2 != 1 ? b2 != 2 ? b2 != 3 ? 1 : 4 : 3 : 2;
                    l5.c();
                    u4f.n((u4f) l5.b, i6);
                    arrayList2.add((u4f) l5.a());
                }
                i = 1;
                l2.c();
                l4f.q((l4f) l2.b, arrayList2);
            }
            if (list.isEmpty()) {
                w3fVar = m;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (m9f m9fVar : list) {
                    String str6 = m9fVar.a;
                    b4f l6 = d4f.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i2 = 13;
                                break;
                            }
                            i2 = i;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i2 = 22;
                                break;
                            }
                            i2 = i;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i2 = 15;
                                break;
                            }
                            i2 = i;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i2 = 19;
                                break;
                            }
                            i2 = i;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i2 = 23;
                                break;
                            }
                            i2 = i;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i2 = 9;
                                break;
                            }
                            i2 = i;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i2 = 21;
                                break;
                            }
                            i2 = i;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i2 = 10;
                                break;
                            }
                            i2 = i;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i2 = 14;
                                break;
                            }
                            i2 = i;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i2 = 7;
                                break;
                            }
                            i2 = i;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i2 = 20;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i2 = i4;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i2 = 8;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i2 = 3;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i2 = 6;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i2 = 5;
                                break;
                            }
                            i2 = i;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i2 = 4;
                                break;
                            }
                            i2 = i;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i2 = 18;
                                break;
                            }
                            i2 = i;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i2 = 16;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i2 = 12;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i2 = 11;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i2 = 17;
                                break;
                            }
                            i2 = i;
                            break;
                        default:
                            i2 = i;
                            break;
                    }
                    l6.c();
                    d4f.q((d4f) l6.b, i2);
                    int i7 = (int) m9fVar.b;
                    l6.c();
                    d4f.m((d4f) l6.b, i7);
                    int i8 = m9fVar.c;
                    l6.c();
                    d4f.n((d4f) l6.b, i8);
                    int i9 = (int) (m9fVar.d - m9fVar.f);
                    l6.c();
                    d4f.o((d4f) l6.b, i9);
                    int i10 = (int) (m9fVar.e - m9fVar.f);
                    l6.c();
                    d4f.p((d4f) l6.b, i10);
                    arrayList3.add((d4f) l6.a());
                    m = m;
                    i4 = 2;
                }
                w3fVar = m;
                l2.c();
                l4f.p((l4f) l2.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (a6d a6dVar : map.values()) {
                    a6dVar.getClass();
                    n4f l7 = p4f.l();
                    byte b3 = a6dVar.e;
                    l7.c();
                    p4f.p((p4f) l7.b, b3);
                    int i11 = a6dVar.d.get();
                    l7.c();
                    p4f.m((p4f) l7.b, i11);
                    int i12 = (int) (a6dVar.a - a6dVar.c);
                    l7.c();
                    p4f.n((p4f) l7.b, i12);
                    int i13 = (int) (a6dVar.b - a6dVar.c);
                    l7.c();
                    p4f.o((p4f) l7.b, i13);
                    arrayList4.add((p4f) l7.a());
                }
                l2.c();
                l4f.r((l4f) l2.b, arrayList4);
            }
            l4f l4fVar = (l4f) l2.a();
            w3fVar.c();
            y3f.q((y3f) w3fVar.b, l4fVar);
            mhfVar.f.a((y3f) w3fVar.a(), kk7.I3);
            this.e = null;
        }
    }

    @Override // xp2
    public final Object a(Class cls) {
        if (!((Set) this.b).contains(xw8.a(cls))) {
            sc8.i(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object a = ((xp2) this.f).a(cls);
        if (!cls.equals(tu8.class)) {
            return a;
        }
        return new oa9();
    }

    @Override // zu9
    public final int a0() {
        return 0;
    }

    @Override // kab
    public final int b(long j) {
        long[] jArr = (long[]) this.c;
        int b = g8c.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // xp2
    public final Set c(xw8 xw8Var) {
        if (((Set) this.e).contains(xw8Var)) {
            return ((xp2) this.f).c(xw8Var);
        }
        sc8.i(xw8Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // xp2
    public final mt8 d(Class cls) {
        return g(xw8.a(cls));
    }

    @Override // xp2
    public final vq7 e(xw8 xw8Var) {
        if (((Set) this.d).contains(xw8Var)) {
            return ((xp2) this.f).e(xw8Var);
        }
        sc8.i(xw8Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public final byte[] f() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = xrc.b;
        BigInteger bigInteger3 = xrc.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            sc8.j("our pubkey invalid (extremely unlikely)");
            return null;
        }
        byte[] b = xrc.b(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            w26.j("peer pubkey out of range");
            return null;
        }
        byte[] b2 = xrc.b(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] d = xrc.d(b2, bArr2, bArr3);
        byte[] d2 = xrc.d(b2, bArr);
        this.f = d;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            int i2 = i << 3;
            arrayList.add(strArr[(int) ((((((((((d2[i2] & 127) << 56) | ((d2[i2 + 1] & 255) << 48)) | ((d2[i2 + 2] & 255) << 40)) | ((d2[i2 + 3] & 255) << 32)) | ((d2[i2 + 4] & 255) << 24)) | ((d2[i2 + 5] & 255) << 16)) | ((d2[i2 + 6] & 255) << 8)) | (d2[i2 + 7] & 255)) % 200)]);
        }
        this.d = arrayList;
        fa4.b("wear-auth: built answer; session " + xrc.c(bArr2) + " emojis=" + ((ArrayList) this.d));
        byte[] bArr4 = new byte[kk7.K4];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(b, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // xp2
    public final mt8 g(xw8 xw8Var) {
        if (((Set) this.c).contains(xw8Var)) {
            return ((xp2) this.f).g(xw8Var);
        }
        sc8.i(xw8Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // lt8
    public final Object get() {
        switch (this.a) {
            case 5:
                return new yb3((Executor) ((lt8) this.b).get(), (md7) ((lt8) this.c).get(), (xl3) ((vk9) this.d).get(), (lo9) ((lt8) this.e).get(), (lo9) ((lt8) this.f).get());
            case 11:
                return new n69((snb) ((kt8) this.b).get(), (rg4) ((mo5) this.c).a, (sr) ((kt8) this.d).get(), (p69) ((kt8) this.e).get(), (h8a) ((kt8) this.f).get());
            default:
                return new g6a((jg4) ((mo5) this.b).a, (rg4) ((mo5) this.c).a, (k7a) ((kt8) this.d).get(), (c44) ((kt8) this.e).get(), (sw2) ((mo5) this.f).a);
        }
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override // kab
    public final long h(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // xp2
    public final Object i(xw8 xw8Var) {
        if (((Set) this.b).contains(xw8Var)) {
            return ((xp2) this.f).i(xw8Var);
        }
        sc8.i(xw8Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((np9) this.f).d;
        pp9 pp9Var = (pp9) this.e;
        pp9 pp9Var2 = (pp9) this.c;
        pp9 pp9Var3 = (pp9) this.d;
        boolean isAttachedToWindow = ((av9) this.b).isAttachedToWindow();
        long A = (long) (f > 0.7f ? (((f - 0.7f) / 0.3f) * 4.0894464E9f) + 1.048576E8f : b00.A(f, 0.7f, 1.0433331E8f, 524288.0f));
        if (f >= 1.0f) {
            pp9Var2.e(false, isAttachedToWindow);
            pp9Var3.e(false, isAttachedToWindow);
            pp9Var.e(true, isAttachedToWindow);
            gl.T3(pp9Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f == 0.0f) {
            pp9Var2.e(true, isAttachedToWindow);
            pp9Var3.e(false, isAttachedToWindow);
            pp9Var.e(false, isAttachedToWindow);
            gl.T3(pp9Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            pp9Var3.c(k96.a0("UpToFileSize", null, 2131743584, gl.i0(A, true, false)), false, true);
            pp9Var2.e(false, isAttachedToWindow);
            pp9Var3.e(true, isAttachedToWindow);
            pp9Var.e(false, isAttachedToWindow);
            gl.T3(pp9Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z) {
            saveToGallerySettingsActivity.b0().c = A;
            saveToGallerySettingsActivity.c0();
        }
    }

    public final fhd k() {
        fre.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        L("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            L("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            this.d = concat;
            L("url", concat);
        }
        fre.i((String) this.c, "setObject is required before calling build().");
        fre.i((String) this.d, "setObject is required before calling build().");
        return new fhd("AssistAction", (String) this.c, (String) this.d, null, new kbd(), (String) this.e, (Bundle) this.b);
    }

    @Override // kab
    public final List l(long j) {
        n2c n2cVar = (n2c) this.b;
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        n2cVar.g(j, n2cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        n2cVar.i(j, false, n2cVar.h, treeMap);
        n2cVar.h(j, map, hashMap, n2cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                q2c q2cVar = (q2c) hashMap.get(pair.first);
                q2cVar.getClass();
                arrayList2.add(new u33(null, null, null, decodeByteArray, q2cVar.c, 0, q2cVar.e, q2cVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, q2cVar.f, q2cVar.g, false, -16777216, q2cVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            q2c q2cVar2 = (q2c) hashMap.get(entry.getKey());
            q2cVar2.getClass();
            t33 t33Var = (t33) entry.getValue();
            CharSequence charSequence = t33Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (td3 td3Var : (td3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), td3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(td3Var), spannableStringBuilder.getSpanEnd(td3Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = q2cVar2.c;
            int i10 = q2cVar2.d;
            t33Var.e = f;
            t33Var.f = i10;
            t33Var.g = q2cVar2.e;
            t33Var.h = q2cVar2.b;
            t33Var.l = q2cVar2.f;
            float f2 = q2cVar2.i;
            int i11 = q2cVar2.h;
            t33Var.k = f2;
            t33Var.j = i11;
            t33Var.p = q2cVar2.j;
            arrayList2.add(t33Var.a());
        }
        return arrayList2;
    }

    public final void m(Canvas canvas, boolean z, boolean z2, int i, float f) {
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.f;
        Paint paint = (Paint) this.e;
        qx0 qx0Var = (qx0) this.b;
        Path path = (Path) this.d;
        int i2 = (int) ((z2 ? 0 : (int) qx0Var.H) * f);
        int L = gl.L(10.0f) * Math.min(1, i2 / gl.L(60.0f));
        if (i2 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f2 = L;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        path.rewind();
        rectF.set(0.0f, 0.0f, i, (qx0Var.getY() + qx0Var.getHeight()) - i2);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z) {
            paint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public final void n(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                n(viewGroup.getChildAt(i));
            }
        }
    }

    public final vq7 o(Class cls) {
        return e(xw8.a(cls));
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((TextView) this.c).setAlpha(gl.R1(0.5f, 1.0f, ((fm0) this.e).e));
        ((nu1) this.f).b(this);
    }

    @Override // s09
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        wt7 wt7Var = (wt7) this.f;
        e09 e09Var = wt7Var.Q1;
        if (e09Var == null) {
            return;
        }
        e09Var.s(h19Var, true);
        wt7Var.O0(false);
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    public final void s(vs2 vs2Var) {
        st stVar = (st) this.b;
        vy4 vy4Var = new vy4(this, vs2Var);
        stVar.getClass();
        fre.e("getMapAsync() must be called on the main thread");
        eq2 eq2Var = (eq2) stVar.b;
        vk9 vk9Var = (vk9) eq2Var.a;
        if (vk9Var != null) {
            vk9Var.r(vy4Var);
        } else {
            ((ArrayList) eq2Var.h).add(vy4Var);
        }
    }

    @Override // kab
    public final int t() {
        return ((long[]) this.c).length;
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    public final boolean w() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        jg4 jg4Var = (jg4) this.c;
        jg4Var.a();
        Context context = jg4Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        Paint paint;
        sl0 sl0Var;
        Path path = (Path) this.c;
        wl0 wl0Var = (wl0) this.d;
        Paint paint2 = (Paint) this.e;
        wt7 wt7Var = (wt7) this.f;
        if (!z && (sl0Var = wt7Var.U1) != null && sl0Var.c()) {
            if (z) {
                wl0Var = (wl0) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            wl0Var.b(canvas, true);
            paint2.setAlpha((int) (i * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z) {
            wl0 wl0Var2 = (wl0) this.b;
            if (wl0Var2 == null) {
                wl0Var2 = new wl0(wt7Var.U1, wt7Var.P1.getReactionsWindow().c, 0, false);
                this.b = wl0Var2;
            }
            float f4 = -f2;
            float f5 = -f3;
            wl0Var2.e(f4, f5, wt7Var.getMeasuredWidth() + f4, wt7Var.getMeasuredHeight() + f5);
            paint = ((wl0) this.b).h;
        } else {
            float f6 = -f2;
            float f7 = -f3;
            wl0Var.e(f6, f7, wt7Var.getMeasuredWidth() + f6, wt7Var.getMeasuredHeight() + f7);
            paint = wl0Var.h;
        }
        paint.setAlpha(i);
        paint2.setAlpha((int) (i * 0.4f));
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, paint2);
    }

    public final qbb z(int i) {
        qbb qbbVar;
        HashMap hashMap = (HashMap) this.c;
        qbb qbbVar2 = (qbb) hashMap.get(Integer.valueOf(i));
        if (qbbVar2 != null) {
            return qbbVar2;
        }
        final tg2 tg2Var = (tg2) this.e;
        tg2Var.getClass();
        final byte b = 0;
        if (i != 0) {
            final byte b2 = 1;
            if (i != 1) {
                final byte b3 = 2;
                if (i != 2) {
                    final byte b4 = 3;
                    if (i == 3) {
                        qbbVar = new ob3(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(qx6.class), b);
                    } else {
                        if (i != 4) {
                            w26.j(de9.k(i, "Unrecognized contentType: "));
                            return null;
                        }
                        qbbVar = new qbb() { // from class: nb3
                            @Override // qbb
                            public final Object get() {
                                byte b5 = b4;
                                tg2 tg2Var2 = tg2Var;
                                Object obj = this;
                                switch (b5) {
                                    case 0:
                                        return qb3.e((Class) obj, tg2Var2);
                                    case 1:
                                        return qb3.e((Class) obj, tg2Var2);
                                    case 2:
                                        return qb3.e((Class) obj, tg2Var2);
                                    default:
                                        return new us8(tg2Var2, (ka3) ((gl2) obj).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(qx6.class);
                    qbbVar = new qbb() { // from class: nb3
                        @Override // qbb
                        public final Object get() {
                            byte b5 = b3;
                            tg2 tg2Var2 = tg2Var;
                            Object obj = asSubclass;
                            switch (b5) {
                                case 0:
                                    return qb3.e((Class) obj, tg2Var2);
                                case 1:
                                    return qb3.e((Class) obj, tg2Var2);
                                case 2:
                                    return qb3.e((Class) obj, tg2Var2);
                                default:
                                    return new us8(tg2Var2, (ka3) ((gl2) obj).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(qx6.class);
                qbbVar = new qbb() { // from class: nb3
                    @Override // qbb
                    public final Object get() {
                        byte b5 = b2;
                        tg2 tg2Var2 = tg2Var;
                        Object obj = asSubclass2;
                        switch (b5) {
                            case 0:
                                return qb3.e((Class) obj, tg2Var2);
                            case 1:
                                return qb3.e((Class) obj, tg2Var2);
                            case 2:
                                return qb3.e((Class) obj, tg2Var2);
                            default:
                                return new us8(tg2Var2, (ka3) ((gl2) obj).b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(qx6.class);
            qbbVar = new qbb() { // from class: nb3
                @Override // qbb
                public final Object get() {
                    byte b5 = b;
                    tg2 tg2Var2 = tg2Var;
                    Object obj = asSubclass3;
                    switch (b5) {
                        case 0:
                            return qb3.e((Class) obj, tg2Var2);
                        case 1:
                            return qb3.e((Class) obj, tg2Var2);
                        case 2:
                            return qb3.e((Class) obj, tg2Var2);
                        default:
                            return new us8(tg2Var2, (ka3) ((gl2) obj).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i), qbbVar);
        return qbbVar;
    }

    @Override // s09
    public final void A() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    public /* synthetic */ gl2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public gl2(h6e h6eVar, p6d p6dVar, String str) {
        this.a = (byte) 25;
        this.b = h6eVar;
        this.c = p6dVar;
        this.d = str;
        this.f = new e6e((Object) this, (byte) 4);
    }

    public gl2(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.d = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.e = vo3.p;
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gl2(Context context) {
        this(context, new ek5(-1, 0, 0));
        this.a = (byte) 21;
    }

    public gl2(Context context, jg4 jg4Var, rg4 rg4Var, ep epVar, kd7 kd7Var) {
        this.a = (byte) 6;
        this.b = new u84(context, u84.t, vn.g, ay4.c);
        this.c = jg4Var;
        this.d = rg4Var;
        this.e = epVar;
        this.f = kd7Var;
    }

    public gl2(Context context, ek5 ek5Var) {
        this.a = (byte) 21;
        this.b = context;
        this.c = ek5Var;
        R();
    }

    public gl2(mp2 mp2Var, xp2 xp2Var) {
        this.a = (byte) 12;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<wd3> set = mp2Var.c;
        Set set2 = mp2Var.g;
        for (wd3 wd3Var : set) {
            byte b = wd3Var.c;
            byte b2 = wd3Var.b;
            boolean z = b == 0;
            xw8 xw8Var = wd3Var.a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(xw8Var);
                } else {
                    hashSet.add(xw8Var);
                }
            } else if (b == 2) {
                hashSet3.add(xw8Var);
            } else if (b2 == 2) {
                hashSet5.add(xw8Var);
            } else {
                hashSet2.add(xw8Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(xw8.a(tu8.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = xp2Var;
    }

    public gl2(n2c n2cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = (byte) 17;
        this.b = n2cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        n2cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public gl2(Activity activity, WallpapersListActivity wallpapersListActivity, crc crcVar) {
        this.a = (byte) 18;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = crcVar;
    }

    public /* synthetic */ gl2(byte b, boolean z) {
        this.a = b;
    }

    public gl2(byte[] bArr, byte[] bArr2, String str) {
        this.a = (byte) 19;
        this.b = bArr;
        this.c = bArr2;
        this.e = str;
    }

    public gl2(nu1 nu1Var) {
        this.a = (byte) 3;
        this.f = nu1Var;
        s33 s33Var = s33.h;
        this.d = new fm0(0, this, s33Var, 320L, true);
        this.e = new fm0(1, this, s33Var, 320L, true);
    }

    public gl2(int i) {
        this.a = (byte) 20;
        this.b = new int[i];
        this.c = new int[i];
        this.f = new float[i];
        this.d = new float[i];
        this.e = new float[i];
    }

    public gl2(np9 np9Var, av9 av9Var, pp9 pp9Var, pp9 pp9Var2, pp9 pp9Var3) {
        this.a = (byte) 14;
        this.f = np9Var;
        this.b = av9Var;
        this.c = pp9Var;
        this.d = pp9Var2;
        this.e = pp9Var3;
    }

    public gl2(ka3 ka3Var, eef eefVar) {
        this.a = (byte) 4;
        this.b = ka3Var;
        this.f = eefVar;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public gl2(qx0 qx0Var) {
        this.a = (byte) 2;
        this.c = new RectF();
        this.f = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.b = qx0Var;
    }

    public gl2(wt7 wt7Var, wl0 wl0Var, Paint paint) {
        this.a = (byte) 8;
        this.f = wt7Var;
        this.d = wl0Var;
        this.e = paint;
        this.c = new Path();
    }
}
