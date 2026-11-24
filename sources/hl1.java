// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ hl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                u47 u47Var = (u47) obj;
                mu1 mu1Var2 = this.b;
                mu1Var2.y5 = u47Var;
                mu1Var2.H5.k.suggested_post = u47Var.c();
                mu1Var2.Mb(true, null, mu1Var2.H5, null, null, true, 0, null, false, 0L);
                break;
            case 1:
            case 9:
                mu1Var.Rb((u47) obj);
                break;
            case 2:
                mu1Var.Jb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    mu1Var.finishFragment();
                    break;
                }
                break;
            case 3:
                mu1Var.ga((String) obj, false);
                break;
            case 4:
                mu1Var.T1 = (ng1) obj;
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof gb2)) {
                    if (!(view instanceof uk1)) {
                        if (!(view instanceof ke2)) {
                            if (!(view instanceof oo0)) {
                                if (view instanceof eq0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((ke2) view).getTextView().setTranslationX(mu1Var.e7() / 2.0f);
                            break;
                        }
                    } else {
                        uk1 uk1Var = (uk1) view;
                        uk1Var.f0 = mu1Var.I7();
                        uk1Var.j0 = mu1Var.U7();
                        mu1Var.T7();
                        mu1Var.d7();
                        int e7 = mu1Var.e7();
                        if (uk1Var.k0 != e7) {
                            uk1Var.k0 = e7;
                            uk1Var.invalidate();
                            break;
                        }
                    }
                } else {
                    gb2 gb2Var = (gb2) view;
                    gb2Var.W6 = mu1Var.I7();
                    gb2Var.X6 = mu1Var.U7();
                    boolean T7 = mu1Var.T7();
                    if (gb2Var.Y6 != T7) {
                        gb2Var.Y6 = T7;
                        mu1Var.A0.getClass();
                        int R = RecyclerView.R(view);
                        gb2Var.F6 = true;
                        gb2Var.forceLayout();
                        if (R >= 0) {
                            mu1Var.D0.g(R);
                        }
                    }
                    gb2Var.Z6 = mu1Var.d7();
                    int e72 = mu1Var.e7();
                    if (gb2Var.a7 != e72) {
                        gb2Var.a7 = e72;
                        gb2Var.d4();
                        gb2Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    mu1Var.S1 = tL_premium_boostsStatus;
                    mu1Var.getMessagesController().E0().b(mu1Var.l6, tL_premium_boostsStatus, new hl1(mu1Var, (byte) 4));
                    break;
                }
                break;
            case 7:
                Long l = (Long) obj;
                kxb kxbVar = mu1Var.g2;
                if (kxbVar != null) {
                    kxbVar.k(l.longValue(), true);
                    break;
                }
                break;
            case 8:
                mu1Var.f0.c.add(((r7) obj).getIconView());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                int i = mu1.md;
                mu1Var.Ha(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i2 = mu1.md;
                mu1Var.Ha(intValue2);
                break;
        }
    }
}
