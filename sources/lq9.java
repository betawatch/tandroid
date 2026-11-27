// default package

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lq9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er9 b;

    public /* synthetic */ lq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.e();
                break;
            case 1:
                LaunchActivity launchActivity = er9Var.a;
                Typeface typeface = hl.a;
                if (Settings.canDrawOverlays(launchActivity) && !ir9.d()) {
                    ir9.e(launchActivity);
                    break;
                }
                break;
            case 2:
                TextView textView = er9Var.x;
                if (!er9Var.u0 && !er9Var.J0) {
                    if (xc2.w(14, er9Var.d)) {
                        textView.setText(hl.S2(ob6.M0(2131747894, null)));
                    } else {
                        TLRPC.Chat chat = er9Var.d;
                        textView.setText(ob6.a0(null, null, 2131747893, chat != null ? chat.title : ""));
                    }
                    er9Var.w.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    ik8.s(textView.animate(), 1.0f, 150L);
                    break;
                }
                break;
            case 3:
                if (!er9Var.J0) {
                    hl.d3(er9Var.N0, 2000L);
                    if (er9Var.u0 && !er9Var.T && !er9Var.I0 && er9Var.s0 && i86.e(512) && (bitmap = er9Var.n.getBitmap(4, 4)) != null) {
                        int b2 = er9.b(0, bitmap);
                        int b3 = er9.b(2, bitmap);
                        bitmap.recycle();
                        int i = er9Var.z0;
                        int i2 = er9Var.A0;
                        if (i != b2 || i2 != b3) {
                            if (i == 0) {
                                i = b2 & 16777215;
                            }
                            er9Var.B0 = i;
                            if (i2 == 0) {
                                i2 = b3 & 16777215;
                            }
                            er9Var.C0 = i2;
                            er9Var.D0 = b2;
                            er9Var.E0 = b3;
                            er9Var.F0 = SystemClock.uptimeMillis();
                            break;
                        }
                    }
                }
                break;
            case 4:
                er9Var.q();
                break;
            case 5:
                er9Var.dismiss();
                break;
            case 6:
                er9Var.a0 = false;
                er9Var.k(!er9Var.n0, true);
                break;
            case 7:
                if (!er9Var.K.I) {
                    er9Var.k(false, true);
                    break;
                } else {
                    er9Var.j();
                    break;
                }
            default:
                er9 er9Var2 = er9.Q0;
                er9Var.u();
                break;
        }
    }
}
