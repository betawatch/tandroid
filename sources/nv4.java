// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nv4 implements hk3, ee, lia, lr2, h59, ln5, lc6, OnCompleteListener, kpb, sm6, ny, fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nv4(String str, h64 h64Var) {
        this.a = (byte) 12;
        this.c = str;
        this.b = h64Var;
    }

    @Override // hk3
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        String str = (String) this.c;
        h64 h64Var = (h64) this.b;
        Context context = (Context) sm2Var.a(Context.class);
        String str2 = "";
        switch (h64Var.a) {
            case 14:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    str2 = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                break;
            case 15:
                str2 = FirebaseCommonRegistrar.a(context);
                break;
            case 16:
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                str2 = "embedded";
                                break;
                            }
                        } else {
                            str2 = "auto";
                            break;
                        }
                    } else {
                        str2 = "watch";
                        break;
                    }
                } else {
                    str2 = "tv";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    str2 = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                break;
        }
        return new ya0(str, str2);
    }

    @Override // sm6
    public final int a(Object obj) {
        Context context = (Context) this.b;
        go4 go4Var = (go4) this.c;
        lm6 lm6Var = (lm6) obj;
        String str = lm6Var.b;
        return ((str.equals(go4Var.t) || str.equals(tm6.c(go4Var))) && lm6Var.c(context, go4Var, false) && lm6Var.d(go4Var)) ? 1 : 0;
    }

    @Override // fu2
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        oz6 oz6Var = (oz6) this.b;
        switch (b) {
            case 28:
                d0c d0cVar = (d0c) obj2;
                cf8 cf8Var = (cf8) obj;
                qo5 qo5Var = d0cVar.H;
                if (!qo5Var.isEmpty()) {
                    c0c c = d0cVar.a().c();
                    v7c it = qo5Var.values().iterator();
                    while (it.hasNext()) {
                        a0c a0cVar = (a0c) it.next();
                        uzb uzbVar = (uzb) oz6Var.d.n.get(a0cVar.a.b);
                        if (uzbVar == null || a0cVar.a.a != uzbVar.a) {
                            c.a(a0cVar);
                        } else {
                            c.a(new a0c(uzbVar, a0cVar.b));
                        }
                    }
                    d0cVar = c.b();
                }
                cf8Var.M(d0cVar);
                break;
            default:
                Surface surface = (Surface) obj2;
                cf8 cf8Var2 = (cf8) obj;
                ((tx6) oz6Var.a.get()).getClass();
                if (surface != null) {
                    mz6 mz6Var = new mz6(surface);
                    oz6Var.n = mz6Var;
                    cf8Var2.Q(mz6Var);
                    break;
                } else {
                    cf8Var2.Q(null);
                    oz6Var.n = null;
                    break;
                }
        }
    }

    @Override // ny
    public final t76 apply(Object obj) {
        qw6 qw6Var = (qw6) obj;
        ((tx6) this.b).s((sw6) this.c, qw6Var);
        return kke.c(qw6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = r0.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r3 = "";
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r0 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.c = true;
        r0.setText(r3);
        r0 = r2.e;
        r0.setSelection(r0.getText().length());
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.d0();
        r2.a.g3.O(true);
        r2.Z(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.E != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.J : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.E = true;
        r0 = r0.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r0 == null) goto L15;
     */
    @Override // lc6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        oc6 oc6Var = (oc6) this.b;
        pc6 pc6Var = (pc6) this.c;
        oc6Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(oc6Var.y)) {
            fc6 fc6Var = pc6Var.Q;
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap i0;
        pc6 pc6Var = (pc6) this.b;
        kc6 kc6Var = (kc6) this.c;
        if (!z || z2 || kc6Var.e == null || (i0 = pc6Var.i0(kc6Var)) == null) {
            return;
        }
        kc6Var.e.a.a(hqd.a(i0));
    }

    @Override // lia
    public final void d(cd6 cd6Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i = cd6Var.h.K1;
        iArr[0] = i;
        launchActivity.N0(i);
        pc6 pc6Var = new pc6(2);
        pc6Var.G0(cd6Var.h);
        pc6Var.M0 = new d12((Object) iArr, k47.B0(cd6Var.h.k), (byte) 8);
        launchActivity.t0(pc6Var);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        pc6 pc6Var = (pc6) this.b;
        Context context = (Context) this.c;
        if (pc6Var.N0 == 2) {
            Object I = pc6Var.Q.I(i);
            if (I instanceof kc6) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                a8 a8Var = new a8(0, pc6Var.getResourceProvider(), pc6Var.getParentActivity(), true, true);
                a8Var.setMinimumWidth(gm.L(200.0f));
                a8Var.j(jb6.M0(2131750406, null), R.drawable.filled_directions, null);
                a8Var.setOnClickListener(new n06(pc6Var, (kc6) I, (byte) 4));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                jc6 jc6Var = new jc6(pc6Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                pc6Var.P0 = jc6Var;
                jc6Var.setOutsideTouchable(true);
                pc6Var.P0.setClippingEnabled(true);
                pc6Var.P0.setInputMethodMode(2);
                pc6Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                pc6Var.P0.showAtLocation(view, 48, 0, iArr[1] - gm.L(52.0f));
                pc6Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 18:
                ua4 ua4Var = (ua4) obj;
                mh6 mh6Var = ((ze6) obj2).a0;
                if (mh6Var.getParentActivity() != null) {
                    mh6Var.getParentActivity().startActivityForResult(ua4Var.h(), nm7.d3);
                    break;
                }
                break;
            case 21:
                ua4 ua4Var2 = (ua4) obj;
                mh6 mh6Var2 = ((cg6) obj2).F;
                if (mh6Var2.getParentActivity() != null && !mh6Var2.getParentActivity().isFinishing()) {
                    mh6Var2.getParentActivity().startActivityForResult(ua4Var2.h(), nm7.d3);
                    break;
                }
                break;
            default:
                lh6 lh6Var = (lh6) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                he heVar = lh6Var.c0;
                if (heVar != null) {
                    heVar.dismiss();
                    lh6Var.c0 = null;
                }
                if (lh6Var.b0 == cancellationTokenSource) {
                    lh6Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        byte b = this.a;
        int i3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pv4 pv4Var = (pv4) obj2;
                String str = (String) obj;
                pv4Var.getClass();
                long j = 0;
                while (i3 < arrayList.size()) {
                    j = ((bf7) arrayList.get(i3)).a;
                    pv4Var.e.getSendMessagesHelper().q0(y5a.b(str, j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i3++;
                }
                nk3Var.finishFragment();
                yn0.h(j);
                break;
            default:
                jx5 jx5Var = (jx5) obj2;
                nk3 nk3Var2 = (nk3) obj;
                t61 t61Var = null;
                while (i3 < arrayList.size()) {
                    ArrayList arrayList2 = jx5Var.g0;
                    t61 t61Var2 = new t61(((bf7) arrayList.get(i3)).a, 3);
                    arrayList2.add(t61Var2);
                    i3++;
                    t61Var = t61Var2;
                }
                jx5Var.e0.h(jx5Var.d0, jx5Var.g0);
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, jx5Var.d0);
                fx5 fx5Var = new fx5(bundle, nk3Var2);
                fx5Var.d = jx5Var.g0;
                fx5Var.Z();
                jx5Var.h0.presentFragment(fx5Var);
                gm.d3(new fd5(fx5Var, t61Var, (byte) 19), 150L);
                break;
        }
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ConferenceCall conferenceCall;
        int i2;
        byte b = this.a;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        b4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                g95 g95Var = (g95) obj2;
                TLObject tLObject = (TLObject) obj;
                j5 j5Var = g95Var.n1;
                if (g95Var.g1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        qd2 qd2Var = g95Var.T2;
                        long j = user.id;
                        ArrayList arrayList = qd2Var.o;
                        if (!arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                            qd2Var.B();
                            nm7.f(qd2Var.C.a).k(nm7.w2, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
                        }
                        g95Var.c1().k(0L, nm7.m1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    oc7.r1(j5Var.a).b0(g95Var.Z0(), user2);
                    g95Var.c1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    oc7.r1(j5Var.a).c0(g95Var.Z0(), null, chat, false, false);
                    g95Var.c1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 2:
                oc5 oc5Var = (oc5) obj2;
                oc5Var.y.d((TLRPC.User) obj);
                if (oc5Var.f.r.length() > 0) {
                    oc5Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 3:
                oc5 oc5Var2 = (oc5) obj2;
                oh2 oh2Var = ((oh2[]) obj)[0];
                if (oh2Var != null && oh2Var.b()) {
                    b4 = 100;
                }
                oc5Var2.q0(b4);
                break;
            case 4:
                te5 te5Var = (te5) obj2;
                af5 a = af5.a(te5Var.a);
                ArrayList arrayList2 = a.f;
                int indexOf = arrayList2.indexOf((String) obj);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a.d();
                }
                te5Var.f.O(true);
                break;
            case 6:
                ((LanguageSelectActivity) obj2).j0((hb6) obj);
                break;
            case 7:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((mh6) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                jb6.D0().d(((hb6[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
            case 13:
                i46 i46Var = (i46) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                i46Var.dismiss();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = oc7.h1((TLRPC.Chat) arrayList3.get(i3));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i46Var.a).sendRequest(tL_channels_updateUsername, new r36(i46Var, b3), 64);
                }
                break;
            case 19:
                ((ff6) obj2).H.C1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 20:
                if6 if6Var = (if6) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", if6Var.r);
                bundle.putString("requestPhone", if6Var.s);
                bundle.putString("phoneHash", if6Var.w);
                bundle.putString("phoneCode", if6Var.x);
                if6Var.E.J1(7, true, bundle, false);
                break;
            case 22:
                ((rg6) obj2).u((Context) obj);
                break;
            default:
                lh6 lh6Var = (lh6) obj2;
                ((boolean[]) obj)[0] = true;
                if (lh6Var.o()) {
                    kc kcVar = new kc(b4);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    lh6Var.b0 = cancellationTokenSource;
                    Context context = lh6Var.getContext();
                    i2 = ((d) lh6Var.h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    k16 k16Var = new k16(lh6Var, cancellationTokenSource, (byte) 28);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    context.getClass();
                    uk0 uk0Var = new uk0(context, (byte) 1);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new yu3(runnableArr, (byte) 21));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = e21.d;
                    tL_auth_initFirebasePnvLogin.api_hash = e21.e;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i4 = 0; i4 < 4; i4++) {
                        z8c h = z8c.h(i4);
                        if (h.o()) {
                            arrayList4.add(Long.valueOf(h.e()));
                        }
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList4;
                    runnableArr[0] = new rt2(i2, ConnectionsManager.getInstance(i2).sendRequestTyped(tL_auth_initFirebasePnvLogin, new kc(b4), new cj4(token, taskCompletionSource, runnableArr, uk0Var, context, k16Var, i2), 8), b2);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(kcVar, new nv4(lh6Var, cancellationTokenSource, (byte) 24)).addOnSuccessListener(kcVar, new hh6(lh6Var)).addOnFailureListener(kcVar, new hh6(lh6Var));
                    break;
                }
                break;
        }
    }

    @Override // kpb
    public final void run() {
        om6 om6Var = (om6) this.b;
        om6Var.T.set(om6Var.A((mj4) this.c, om6Var.N, 0));
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    public /* synthetic */ nv4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
