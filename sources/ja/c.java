package ja;

import af.h;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.q;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import b4.e0;
import c2.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.k0;
import f2.l1;
import f2.o0;
import f2.w0;
import h5.d0;
import j$.util.DesugarCollections;
import j7.r5;
import j8.e;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import kc.k;
import l.i;
import la.b0;
import m.j1;
import o2.l;
import o7.d;
import o7.f;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y4;
import s5.m;
import v7.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, k0, a3.b, o, j1, Continuation, s, i, o0.a, WebMessageListenerBoundaryInterface, x61, y4, na0 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static c o(float f10, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new c(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new c(i11, i12, new int[0]) : new c(i12, i11, new int[0]);
    }

    @Override // f2.k0
    public void D(int i10, int i11) {
        ((o0) this.b).p(i10, i11);
    }

    @Override // androidx.lifecycle.a0
    public void G(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        q qVar = (q) this.b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.i0.d(null);
        }
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        ((ChatActivityEnterView) this.b).T0(i10, z4, 0, true, 0L);
    }

    @Override // f2.k0
    public void L0(int i10, int i11) {
        ((o0) this.b).t(i10, i11);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 15:
                e eVar = (e) this.b;
                s7.b bVar = (s7.b) obj;
                bVar.getClass();
                s7.a aVar = new s7.a(1, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    r5.a(Status.h, Boolean.FALSE, aVar.b);
                    return;
                }
            default:
                z7.c cVar = (z7.c) this.b;
                d dVar = new d(1, (TaskCompletionSource) obj2);
                o7.c cVar2 = (o7.c) ((f) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = o7.a.a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                cVar.writeToParcel(obtain2, 0);
                cVar2.E0(obtain2, 1);
                return;
        }
    }

    @Override // o0.a
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void c(int i10, boolean z4) {
        u uVar = (u) this.b;
        if (z4) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e) {
                k.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
        }
        arrayList.clear();
    }

    public synchronized void e() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // org.telegram.ui.Components.na0
    public Paint.FontMetricsInt f() {
        return ((li) this.b).B0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void g(Object obj) {
        ((u7.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // rc.a
    public Object get() {
        String packageName = ((Context) ((rc.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void h(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // f2.k0
    public void h0(int i10, int i11) {
        ((o0) this.b).s(i10, i11);
    }

    @Override // l.i
    public void i(l.k kVar) {
        bb.b bVar = ((ActionMenuView) this.b).H;
        if (bVar != null) {
            bVar.i(kVar);
        }
    }

    @Override // org.telegram.ui.Components.x61
    public void invalidate() {
        ((s1) ((f1) this.b).b).invalidate();
    }

    @Override // f2.k0
    public void j1(int i10, int i11) {
        ((o0) this.b).r(i10, i11, null);
    }

    public Set k() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public boolean l() {
        x0 x0Var = ((j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public void m(b0 b0Var) {
        ((y2.o) ((v2.f) ((ba.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new gg.f(this, 25)).a(new v2.a(null, b0Var, v2.d.a, null), new s0.b(29));
    }

    public void n(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < v; i15++) {
            View u10 = recyclerView.e.u(i15);
            l1 U = RecyclerView.U(u10);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((w0) u10.getLayoutParams()).c = true;
            }
        }
        h hVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) hVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            l1 l1Var = (l1) arrayList2.get(size);
            if (l1Var != null && (i12 = l1Var.c) >= i10 && i12 < i14) {
                l1Var.a(2);
                hVar.f(size);
            }
        }
        recyclerView.u0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z4, InvocationHandler invocationHandler2) {
        e0 e0Var;
        e0 e0Var2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) ee.b.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        o2.i[] iVarArr = new o2.i[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            o2.i iVar = new o2.i(0);
            iVar.b = (WebMessagePortBoundaryInterface) ee.b.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            iVarArr[i10] = iVar;
        }
        if (l.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) ee.b.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                e0Var = new e0(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    e0Var2 = null;
                    if (e0Var2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) ee.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((n2.a) this.b).i(webView, e0Var2, uri, z4, (o2.f) jsReplyProxyBoundaryInterface.getOrCreatePeer(new j9.o(jsReplyProxyBoundaryInterface, 2)));
                        return;
                    }
                    return;
                }
                e0Var = new e0(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            e0Var = new e0(webMessageBoundaryInterface.getData());
        }
        e0Var2 = e0Var;
        if (e0Var2 == null) {
        }
    }

    public void p(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        for (int i12 = 0; i12 < v; i12++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.q0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            l1 l1Var = (l1) arrayList.get(i13);
            if (l1Var != null && l1Var.c >= i10) {
                l1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.t0 = true;
    }

    @Override // l.i
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).M;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((androidx.biometric.e0) kVar2).b).T.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public void r(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int v = recyclerView.e.v();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < v; i20++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.q0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            l1 l1Var = (l1) arrayList.get(i21);
            if (l1Var != null && (i17 = l1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    l1Var.n(i11 - i10, false);
                } else {
                    l1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.t0 = true;
    }

    public void s(m mVar) {
        j jVar = (j) this.b;
        jVar.a = mVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((l6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public void t(IBinder iBinder) {
        synchronized (((HashMap) this.b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new m8.x0();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + BuildConfig.BETA_URL);
                }
            }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    @Override // org.telegram.ui.Components.na0
    public void v(int i10, int i11, CharSequence charSequence, boolean z4) {
        li liVar = (li) this.b;
        if (liVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(liVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, liVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            liVar.m1().setText(spannableStringBuilder);
            liVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // androidx.activity.result.b
    public void x(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s r10 = j0Var.c.r(str);
        if (r10 != null) {
            r10.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                break;
            case 12:
                this.b = new CopyOnWriteArrayList();
                break;
            case 14:
                this.b = new u();
                break;
            case 16:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            case 21:
                this.b = new HashMap();
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.a = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                e();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public c(l3.d dVar) {
        this.a = 17;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.a).setFlags(dVar.b).setUsage(dVar.c);
        int i10 = d0.a;
        if (i10 >= 29) {
            l3.b.a(usage, dVar.d);
        }
        if (i10 >= 32) {
            l3.c.a(usage, dVar.e);
        }
        this.b = usage.build();
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void E(String str) {
    }

    public c(int i10, int i11, int[] iArr) {
        this.a = 27;
        a60[] a60VarArr = new a60[(iArr.length / 2) + 1];
        this.b = a60VarArr;
        a60 a60Var = new a60(i10, i11);
        int i12 = 0;
        a60VarArr[0] = a60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((a60[]) this.b)[i13] = new a60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public c(Context context, Uri uri) {
        this.a = 22;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override // org.telegram.ui.Components.na0
    public /* synthetic */ void j(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
