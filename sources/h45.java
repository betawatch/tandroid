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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h45 implements ed, wi3, jga, aq2, e39, ll5, ma6, OnCompleteListener, jnb, pk6, mx, us2, lx6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h45(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap h0;
        qa6 qa6Var = (qa6) this.b;
        la6 la6Var = (la6) this.c;
        if (!z || z2 || la6Var.e == null || (h0 = qa6Var.h0(la6Var)) == null) {
            return;
        }
        la6Var.e.a.a(eod.a(h0));
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        String str = (String) this.b;
        w44 w44Var = (w44) this.c;
        Context context = (Context) gl2Var.a(Context.class);
        String str2 = "";
        switch (w44Var.a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    str2 = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                break;
            case 13:
                str2 = FirebaseCommonRegistrar.a(context);
                break;
            case 14:
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
        return new y90(str, str2);
    }

    @Override // pk6
    public final int a(Object obj) {
        Context context = (Context) this.b;
        fm4 fm4Var = (fm4) this.c;
        ik6 ik6Var = (ik6) obj;
        String str = ik6Var.b;
        return ((str.equals(fm4Var.t) || str.equals(qk6.c(fm4Var))) && ik6Var.c(context, fm4Var, false) && ik6Var.d(fm4Var)) ? 1 : 0;
    }

    @Override // us2
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ox6 ox6Var = (ox6) this.b;
        switch (b) {
            case 27:
                byb bybVar = (byb) obj2;
                ad8 ad8Var = (ad8) obj;
                qm5 qm5Var = bybVar.H;
                if (!qm5Var.isEmpty()) {
                    ayb c = bybVar.a().c();
                    v5c it = qm5Var.values().iterator();
                    while (it.hasNext()) {
                        yxb yxbVar = (yxb) it.next();
                        sxb sxbVar = (sxb) ox6Var.d.n.get(yxbVar.a.b);
                        if (sxbVar == null || yxbVar.a.a != sxbVar.a) {
                            c.a(yxbVar);
                        } else {
                            c.a(new yxb(sxbVar, yxbVar.b));
                        }
                    }
                    bybVar = c.b();
                }
                ad8Var.M(bybVar);
                break;
            default:
                Surface surface = (Surface) obj2;
                ad8 ad8Var2 = (ad8) obj;
                ((tv6) ox6Var.a.get()).getClass();
                if (surface != null) {
                    mx6 mx6Var = new mx6(surface);
                    ox6Var.n = mx6Var;
                    ad8Var2.Q(mx6Var);
                    break;
                } else {
                    ad8Var2.Q(null);
                    ox6Var.n = null;
                    break;
                }
        }
    }

    @Override // mx
    public final t56 apply(Object obj) {
        qu6 qu6Var = (qu6) obj;
        ((tv6) this.b).s((su6) this.c, qu6Var);
        return jie.c(qu6Var);
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
    
        r2.c0();
        r2.a.g3.O(true);
        r2.Y(true);
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
    @Override // ma6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        pa6 pa6Var = (pa6) this.b;
        qa6 qa6Var = (qa6) this.c;
        pa6Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(pa6Var.y)) {
            ga6 ga6Var = qa6Var.Q;
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        qa6 qa6Var = (qa6) this.b;
        Context context = (Context) this.c;
        if (qa6Var.N0 == 2) {
            Object I = qa6Var.Q.I(i);
            if (I instanceof la6) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context, null);
                a8 a8Var = new a8(0, qa6Var.getResourceProvider(), qa6Var.getParentActivity(), true, true);
                a8Var.setMinimumWidth(gl.L(200.0f));
                a8Var.j(k96.M0(2131750457, null), R.drawable.filled_directions, null);
                a8Var.setOnClickListener(new v16(qa6Var, (la6) I, (byte) 3));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                ka6 ka6Var = new ka6(qa6Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qa6Var.P0 = ka6Var;
                ka6Var.setOutsideTouchable(true);
                qa6Var.P0.setClippingEnabled(true);
                qa6Var.P0.setInputMethodMode(2);
                qa6Var.P0.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                qa6Var.P0.showAtLocation(view, 48, 0, iArr[1] - gl.L(52.0f));
                qa6Var.P0.b();
                return true;
            }
        }
        return false;
    }

    @Override // jga
    public final void e(db6 db6Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        int[] iArr = (int[]) this.c;
        String str = LaunchActivity.C1;
        int i = db6Var.h.K1;
        iArr[0] = i;
        launchActivity.N0(i);
        qa6 qa6Var = new qa6(2);
        qa6Var.F0(db6Var.h);
        qa6Var.M0 = new rz1((Object) iArr, k27.B0(db6Var.h.k), (byte) 8);
        launchActivity.t0(qa6Var);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 17:
                u84 u84Var = (u84) obj;
                mf6 mf6Var = ((ad6) obj2).a0;
                if (mf6Var.getParentActivity() != null) {
                    mf6Var.getParentActivity().startActivityForResult(u84Var.h(), kk7.d3);
                    break;
                }
                break;
            case 20:
                u84 u84Var2 = (u84) obj;
                mf6 mf6Var2 = ((de6) obj2).F;
                if (mf6Var2.getParentActivity() != null && !mf6Var2.getParentActivity().isFinishing()) {
                    mf6Var2.getParentActivity().startActivityForResult(u84Var2.h(), kk7.d3);
                    break;
                }
                break;
            default:
                lf6 lf6Var = (lf6) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                hd hdVar = lf6Var.c0;
                if (hdVar != null) {
                    hdVar.dismiss();
                    lf6Var.c0 = null;
                }
                if (lf6Var.b0 == cancellationTokenSource) {
                    lf6Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        return tv6Var.i() ? jie.c(new o6a(-100)) : g8c.h0((t56) ((lx6) this.b).p(tv6Var, su6Var, i), new lt2((Object) tv6Var, (Object) su6Var, this.c, (byte) 16));
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        jv5 jv5Var = (jv5) this.b;
        cj3 cj3Var2 = (cj3) this.c;
        m51 m51Var = null;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            ArrayList arrayList2 = jv5Var.g0;
            m51 m51Var2 = new m51(((zc7) arrayList.get(i3)).a, 3);
            arrayList2.add(m51Var2);
            i3++;
            m51Var = m51Var2;
        }
        jv5Var.e0.h(jv5Var.d0, jv5Var.g0);
        Bundle bundle = new Bundle();
        bundle.putInt(TeXSymbolParser.TYPE_ATTR, jv5Var.d0);
        fv5 fv5Var = new fv5(bundle, cj3Var2);
        fv5Var.d = jv5Var.g0;
        fv5Var.Y();
        jv5Var.h0.presentFragment(fv5Var);
        gl.d3(new hb5(fv5Var, m51Var, (byte) 18), 150L);
        return true;
    }

    @Override // jnb
    public final void run() {
        lk6 lk6Var = (lk6) this.b;
        lk6Var.T.set(lk6Var.A((sk4) this.c, lk6Var.N, 0));
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
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
            case 0:
                h75 h75Var = (h75) obj2;
                TLObject tLObject = (TLObject) obj;
                j5 j5Var = h75Var.n1;
                if (h75Var.g1()) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null && (conferenceCall = sharedInstance.conference) != null && (tLObject instanceof TLRPC.User)) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        conferenceCall.kick(user.id);
                        fc2 fc2Var = h75Var.T2;
                        long j = user.id;
                        ArrayList arrayList = fc2Var.o;
                        if (!arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                            fc2Var.B();
                            kk7.f(fc2Var.C.a).k(kk7.v2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
                        }
                        h75Var.c1().k(0L, kk7.m1, user, null, null, null);
                        break;
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    na7.q1(j5Var.a).b0(h75Var.Z0(), user2);
                    h75Var.c1().k(0L, 32, user2, null, null, null);
                    break;
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    na7.q1(j5Var.a).c0(h75Var.Z0(), null, chat, false, false);
                    h75Var.c1().k(0L, 32, chat, null, null, null);
                    break;
                }
                break;
            case 1:
                qa5 qa5Var = (qa5) obj2;
                qa5Var.y.e((TLRPC.User) obj);
                if (qa5Var.f.r.length() > 0) {
                    qa5Var.f.r.setText((CharSequence) null);
                    break;
                }
                break;
            case 2:
                qa5 qa5Var2 = (qa5) obj2;
                ag2 ag2Var = ((ag2[]) obj)[0];
                if (ag2Var != null && ag2Var.b()) {
                    b4 = 100;
                }
                qa5Var2.p0(b4);
                break;
            case 3:
                vc5 vc5Var = (vc5) obj2;
                cd5 a = cd5.a(vc5Var.a);
                ArrayList arrayList2 = a.f;
                int indexOf = arrayList2.indexOf((String) obj);
                if (indexOf != -1) {
                    arrayList2.remove(indexOf);
                    a.d();
                }
                vc5Var.f.O(true);
                break;
            case 5:
                ((LanguageSelectActivity) obj2).i0((i96) obj);
                break;
            case 6:
                String str = LaunchActivity.C1;
                ((LaunchActivity) obj2).t0((mf6) obj);
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                String str2 = LaunchActivity.C1;
                k96.D0().d(((i96[]) obj)[0], true, false, launchActivity.P);
                launchActivity.y0(true);
                break;
            case 12:
                h26 h26Var = (h26) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                h26Var.dismiss();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = na7.g1((TLRPC.Chat) arrayList3.get(i3));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(h26Var.a).sendRequest(tL_channels_updateUsername, new r16(h26Var, b3), 64);
                }
                break;
            case 18:
                ((gd6) obj2).H.B1((TLRPC.TL_auth_authorization) ((TLObject) obj), false);
                break;
            case 19:
                jd6 jd6Var = (jd6) obj2;
                Bundle bundle = new Bundle();
                bundle.putString("email_unconfirmed_pattern", ((TLRPC.TL_auth_passwordRecovery) obj).email_pattern);
                bundle.putString("password", jd6Var.r);
                bundle.putString("requestPhone", jd6Var.s);
                bundle.putString("phoneHash", jd6Var.w);
                bundle.putString("phoneCode", jd6Var.x);
                jd6Var.E.I1(7, true, bundle, false);
                break;
            case 21:
                ((qe6) obj2).u((Context) obj);
                break;
            default:
                lf6 lf6Var = (lf6) obj2;
                ((boolean[]) obj)[0] = true;
                if (lf6Var.o()) {
                    hc hcVar = new hc(b4);
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    lf6Var.b0 = cancellationTokenSource;
                    Context context = lf6Var.getContext();
                    i2 = ((d) lf6Var.h0).currentAccount;
                    CancellationToken token = cancellationTokenSource.getToken();
                    kz5 kz5Var = new kz5(lf6Var, cancellationTokenSource, (byte) 27);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource(token);
                    context.getClass();
                    p13 p13Var = new p13(context, (byte) 0);
                    Runnable[] runnableArr = new Runnable[1];
                    token.onCanceledRequested(new kx3(runnableArr, (byte) 18));
                    TLRPC.TL_auth_initFirebasePnvLogin tL_auth_initFirebasePnvLogin = new TLRPC.TL_auth_initFirebasePnvLogin();
                    tL_auth_initFirebasePnvLogin.api_id = w01.d;
                    tL_auth_initFirebasePnvLogin.api_hash = w01.e;
                    ArrayList<Long> arrayList4 = new ArrayList<>();
                    for (int i4 = 0; i4 < 4; i4++) {
                        y6c h = y6c.h(i4);
                        if (h.o()) {
                            arrayList4.add(Long.valueOf(h.e()));
                        }
                    }
                    tL_auth_initFirebasePnvLogin.except_ids = arrayList4;
                    runnableArr[0] = new gs2(i2, ConnectionsManager.getInstance(i2).sendRequestTyped(tL_auth_initFirebasePnvLogin, new hc(b4), new ah4(token, taskCompletionSource, runnableArr, p13Var, context, kz5Var, i2), 8), b2);
                    if (token.isCancellationRequested()) {
                        runnableArr[0].run();
                    }
                    taskCompletionSource.getTask().addOnCompleteListener(hcVar, new h45(lf6Var, cancellationTokenSource, (byte) 23)).addOnSuccessListener(hcVar, new gf6(lf6Var)).addOnFailureListener(hcVar, new gf6(lf6Var));
                    break;
                }
                break;
        }
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}
