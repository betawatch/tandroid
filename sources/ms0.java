// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ms0 implements vi5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vi5
    public final void a(ucb ucbVar, RectF rectF) {
        byte b = this.a;
        ucbVar.b = true;
    }

    @Override // vi5
    public final void g(Canvas canvas, RectF rectF) {
        a22 a22Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rs0 rs0Var = (rs0) obj;
                RectF rectF2 = rs0Var.E;
                if (rs0Var.s != null) {
                    rs0Var.i0(rectF2);
                    canvas.save();
                    canvas.clipRect(rectF2);
                    ss0 ss0Var = rs0Var.d;
                    tl0.b(ss0Var, canvas, rectF, ss0Var, rs0Var.c, (int) ((rs0Var.s != null ? Math.min(1.0f, rs0Var.x / 0.22f) : 1.0f) * 255.0f));
                    canvas.restore();
                    break;
                } else {
                    ss0 ss0Var2 = rs0Var.d;
                    tl0.a(ss0Var2, canvas, rectF, ss0Var2, rs0Var.c);
                    break;
                }
            case 1:
                my0 my0Var = (my0) obj;
                ViewGroup viewGroup = my0Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == my0Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                ((tg1) obj).X(canvas, rectF);
                break;
            case 3:
                i22 i22Var = (i22) obj;
                int i = 0;
                while (i < 2) {
                    a22 a22Var2 = i == 0 ? i22Var.v2 : i22Var.w2;
                    if (a22Var2 != null && a22Var2.c != null && a22Var2.getVisibility() == 0) {
                        tl0.b(a22Var2.c, canvas, rectF, a22Var2.d, i22Var.b, (int) (((i == 0 && (a22Var = i22Var.w2) != null && a22Var.getVisibility() == 0) ? (1.0f - i22Var.w2.getAlpha()) * a22Var2.getAlpha() : a22Var2.getAlpha()) * 255.0f));
                    }
                    i++;
                }
                break;
            case 4:
                e34 e34Var = (e34) obj;
                r14 r14Var = e34Var.Q;
                tl0.a(r14Var, canvas, rectF, r14Var, e34Var);
                g04 g04Var = e34Var.i0;
                tl0.a(g04Var, canvas, rectF, g04Var, e34Var);
                l04 l04Var = e34Var.E0;
                tl0.a(l04Var, canvas, rectF, l04Var, e34Var);
                break;
            case 5:
                ((pc6) obj).e0(canvas, rectF);
                break;
            case 6:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                r59 r59Var = premiumPreviewFragment.a;
                tl0.a(r59Var, canvas, rectF, r59Var, premiumPreviewFragment.e0);
                break;
            case 7:
                RectF rectF3 = ProfileActivity.e7;
                canvas.save();
                canvas.translate(-r0.getScrollX(), -r0.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 8:
                RectF rectF4 = ProfileActivity.e7;
                xq8 xq8Var = ((ProfileActivity) obj).d1;
                int i2 = xq8.R;
                xq8Var.P = true;
                xq8Var.draw(canvas);
                xq8Var.P = false;
                break;
            case 9:
                po8 po8Var = (po8) obj;
                yk0 yk0Var = po8Var.S2;
                if (yk0Var == null) {
                    d59 d59Var = po8Var.H2;
                    if (d59Var != null) {
                        d59Var.g(canvas, rectF);
                        break;
                    }
                } else {
                    yk0Var.g(canvas, rectF);
                    break;
                }
                break;
            case 10:
                zz9 zz9Var = (zz9) obj;
                r59 r59Var2 = zz9Var.n1;
                tl0.b(r59Var2, canvas, rectF, r59Var2, zz9Var.b, nm7.d4);
                break;
            case 11:
                tca tcaVar = (tca) obj;
                vba vbaVar = tcaVar.A1;
                tl0.a(vbaVar, canvas, rectF, vbaVar, tcaVar.b);
                break;
            default:
                goc gocVar = (goc) obj;
                va vaVar = gocVar.a;
                tl0.a(vaVar, canvas, rectF, vaVar, (ViewGroup) gocVar.fragmentView);
                unc uncVar = gocVar.e;
                if (uncVar != null && gocVar.n != null && uncVar.getVisibility() == 0 && gocVar.e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(gocVar.n.getX() + gocVar.e.getLeft(), gocVar.n.getY() + gocVar.e.getTop());
                    canvas.concat(gocVar.e.getMatrix());
                    if (gocVar.e.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, gocVar.e.getWidth(), gocVar.e.getHeight(), (int) (gocVar.e.getAlpha() * 255.0f));
                    }
                    gocVar.e.draw(canvas);
                    canvas.restoreToCount(save);
                    break;
                }
                break;
        }
    }
}
