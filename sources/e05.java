// default package

import android.content.ClipData;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e05 implements Continuation, rv9, fd, pg2, f73, gq5, z8c, ic1, OnSuccessListener, OnFailureListener, t69, nr7, s69, s84 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e05(x05 x05Var, c22 c22Var) {
        this.a = (byte) 4;
        this.b = x05Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // rv9
    public final boolean C1(int i) {
        byte b = this.a;
        return true;
    }

    @Override // rv9
    public final zh6 D0() {
        byte b = this.a;
        return null;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        c26 c26Var = (c26) this.b;
        mq5 H0 = hl.H0(l2dVar, false);
        if (!c26Var.a.equals(H0)) {
            c26Var.a = H0;
            c26Var.requestLayout();
        }
        int childCount = c26Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ihc.b(c26Var.getChildAt(i), l2dVar);
        }
        return l2dVar;
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
        byte b = this.a;
    }

    @Override // rv9
    public final zh6 Z0() {
        byte b = this.a;
        return null;
    }

    @Override // gq5
    public final boolean a(kj4 kj4Var, int i, Bundle bundle) {
        xv2 xv2Var;
        ip ipVar = (ip) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((iq5) kj4Var.b).g();
                Parcelable parcelable = (Parcelable) ((iq5) kj4Var.b).j();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        iq5 iq5Var = (iq5) kj4Var.b;
        ClipData clipData = new ClipData(iq5Var.getDescription(), new ClipData.Item(iq5Var.e()));
        if (i2 >= 31) {
            xv2Var = new wv2(clipData, 2);
        } else {
            yv2 yv2Var = new yv2();
            yv2Var.b = clipData;
            yv2Var.c = (byte) 2;
            xv2Var = yv2Var;
        }
        xv2Var.c(iq5Var.h());
        xv2Var.setExtras(bundle);
        return ihc.j(ipVar, xv2Var.build()) == null;
    }

    @Override // pg2
    public final void b() {
        fg5 fg5Var = (fg5) this.b;
        float progress = 1.0f - (fg5Var.w.getProgress() * 0.143f);
        de0 de0Var = fg5Var.a;
        de0Var.setScaleX(progress);
        de0Var.setScaleY(progress);
        fg5Var.invalidate();
    }

    @Override // f73
    public final h73 createDataSource() {
        return ((f73) ((z8d) this.b).b).createDataSource();
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        int Y;
        q86 q86Var = (q86) this.b;
        ArrayList arrayList = q86Var.s;
        if (view == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        k86 k86Var = (k86) arrayList.get(i);
        int i2 = k86Var.a;
        int i3 = k86Var.e;
        if (i2 == 3 || i2 == 4) {
            if (i86.f()) {
                q86Var.e = d31.b0(q86Var).M(new dh0(0.1f, aob.w0(null, aob.Y5, false)), ob6.M0(2131748623, null)).j();
                return;
            }
            if (k86Var.a == 3 && Integer.bitCount(i3) > 1 && (!ob6.a0 ? f >= view.getMeasuredWidth() - hl.L(75.0f) : f <= hl.L(75.0f)) && (Y = q86Var.Y(i3)) != -1) {
                q86Var.n[Y] = !r6[Y];
                q86Var.c0();
                q86Var.b0();
                return;
            }
            boolean z = (i86.d(true) & i3) > 0;
            int d = i86.d(true);
            i86.i = !z ? d | i3 : d & (~i3);
            i86.k();
            q86Var.c0();
        } else if (i2 == 5 && k86Var.f) {
            SharedPreferences e1 = uc7.e1();
            boolean z2 = e1.getBoolean("view_animations", true);
            SharedPreferences.Editor edit = e1.edit();
            boolean z3 = !z2;
            edit.putBoolean("view_animations", z3);
            xea.y1 = Boolean.valueOf(z3);
            edit.commit();
            ((skb) view).setChecked(z3);
        }
        vy4.f();
    }

    @Override // t69
    public final boolean e(int i, View view) {
        return ((LanguageSelectActivity) this.b).j0(i, view);
    }

    @Override // z8c
    public final void f() {
        hc8 hc8Var = (hc8) this.b;
        TextView textView = hc8Var.i1;
        boolean a = hc8Var.p0.a();
        ImageView imageView = hc8Var.g1;
        imageView.animate().cancel();
        imageView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        textView.animate().alpha(a ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override // ic1
    public final long get() {
        return ((hc8) ((aj3) this.b).b).getCaptionsVideoPosition();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((dz5) this.b).l(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((ez5) this.b).a((String) obj);
    }

    @Override // rv9
    public final void p(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                pc5 pc5Var = (pc5) obj;
                rc5 rc5Var = pc5Var.J;
                rc5Var.t0(pc5Var.I);
                if (pc5Var.h == null && !pc5Var.f.e() && pc5Var.b() == 0) {
                    rc5Var.s.e(false, true);
                }
                pc5Var.f();
                break;
            default:
                ht5 ht5Var = (ht5) obj;
                lt5 lt5Var = ht5Var.n;
                lt5Var.K0(ht5Var.f - 1);
                if (ht5Var.h == null && !ht5Var.e.e() && ht5Var.b() <= 2) {
                    lt5Var.t1.e(false, true);
                }
                ht5Var.f();
                break;
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        hj6 hj6Var = (hj6) this.b;
        hj6Var.setScaleX(hl.R1(1.0f, 1.019f, f));
        hj6Var.setScaleY(hl.R1(1.0f, 1.019f, f));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Exception exception;
        am2 am2Var = (am2) this.b;
        am2Var.getClass();
        if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
            return task;
        }
        Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
        ((qi4) ((ri4) am2Var.d)).c.B().delete();
        return am2Var.L();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 9:
                ((dd5) obj).Y(true);
                break;
            case 14:
                lt5 lt5Var = (lt5) obj;
                zh6 zh6Var = lt5Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                    arrayList.add(uc7.s1(lt5Var.a).X1(Long.valueOf(zh6Var.j(i3))));
                }
                lc5 lc5Var = lt5Var.f2;
                if (lc5Var != null) {
                    lc5Var.f(0, arrayList);
                }
                lt5Var.dismiss();
                break;
            case 17:
                ((y98) obj).run();
                break;
            case 19:
                ((py5) obj).a.T1.p();
                break;
            case 23:
                String str = LaunchActivity.C1;
                hl.g((StringBuilder) obj);
                break;
            case 26:
                df6 df6Var = (df6) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", df6Var.J);
                bundle.putString("ephone", df6Var.K);
                bundle.putString("phoneFormated", df6Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = df6Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = df6Var.N;
                df6Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ve6(df6Var, bundle, tL_auth_resetLoginEmail, b2), 10);
                break;
            case 27:
                lf6 lf6Var = (lf6) obj;
                lf6Var.E.O1(lf6Var.s, lf6Var.w, lf6Var.x);
                break;
            default:
                dg6 dg6Var = (dg6) obj;
                qh6 qh6Var = dg6Var.H;
                qh6Var.B1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i2 = ((e) qh6Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(deleteaccount, new w15(dg6Var, (byte) 7), 10);
                break;
        }
    }

    public /* synthetic */ e05(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(ArrayList arrayList) {
    }

    private final void g(ArrayList arrayList) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
