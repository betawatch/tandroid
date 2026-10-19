package ci;

import android.view.WindowManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements bw0, cw0, org.telegram.ui.ActionBar.a2, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final /* synthetic */ int a;

    public /* synthetic */ i1(int i10) {
        this.a = i10;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                m.g3 g3Var = com.google.firebase.messaging.o.a;
                g3Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g3Var.z(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 12:
                return Integer.valueOf(((d2.b) obj).r);
            default:
                da.a.b.getClass();
                return aa.b.a.M((z9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.ui.Components.cw0
    public void b(Object obj, float f7) {
        p1 p1Var = (p1) obj;
        switch (this.a) {
            case 1:
                WindowManager.LayoutParams layoutParams = p1Var.c;
                p1Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(p1Var.b, p1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = p1Var.c;
                p1Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(p1Var.b, p1Var.d, layoutParams2);
                break;
        }
    }

    @Override // eh.d
    public int f(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        switch (this.a) {
            case 17:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sd, d6Var));
            case 18:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                }
                return org.telegram.ui.ActionBar.h6.m1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false));
            case 19:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Zk, d6Var));
            case 20:
                return org.telegram.ui.ActionBar.h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, d6Var));
            case 21:
                return 855638016;
            case 22:
                return TLObject.FLAG_30;
            case 23:
                return org.telegram.ui.ActionBar.h6.m1(0.075f, -16777216);
            case 24:
                return org.telegram.ui.ActionBar.h6.m1(0.88f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            case 25:
                return org.telegram.ui.ActionBar.h6.m1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false));
            case 26:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yk, d6Var));
            case 27:
                return org.telegram.ui.ActionBar.h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            case 28:
                return org.telegram.ui.ActionBar.h6.m1(0.78f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
            default:
                return org.telegram.ui.ActionBar.h6.m1(0.7f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bw0
    public float get(Object obj) {
        p1 p1Var = (p1) obj;
        switch (this.a) {
            case 0:
                return p1Var.N;
            default:
                return p1Var.O;
        }
    }

    @Override // r9.d
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = ei.q3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 7:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }
}
