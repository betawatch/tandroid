// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ai extends LinearLayout {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ hq7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Activity activity, zh zhVar) {
        super(activity);
        this.a = (byte) 0;
        this.e = zhVar;
        this.c = new pkb(":", 18.0f, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pkb pkbVar;
        switch (this.a) {
            case 0:
                Object obj = this.c;
                int i = aob.G6;
                ((pkb) obj).c((getWidth() - ((pkb) obj).c) / 2.0f, getHeight() / 2.0f, 1.0f, aob.w0(null, i, false), canvas);
                if (!ob6.c0) {
                    boolean z = ((zh) this.e).getValue() % 24 < 12;
                    if (this.b != z || (pkbVar = (pkb) this.d) == null) {
                        this.b = z;
                        pkbVar = new pkb(z ? "AM" : "PM", 18.0f, null);
                        this.d = pkbVar;
                    }
                    pkbVar.c((getWidth() / 2.0f) + hl.L(43.0f), (getHeight() / 2.0f) + hl.L(1.0f), 1.0f, aob.w0(null, i, false), canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.a;
        Object obj = this.c;
        hq7 hq7Var = this.e;
        switch (b) {
            case 1:
                ei eiVar = (ei) hq7Var;
                di diVar = (di) this.d;
                hq7 hq7Var2 = (hq7) obj;
                this.b = true;
                Point point = hl.q;
                i3 = point.x > point.y ? 3 : 5;
                hq7Var2.setItemCount(i3);
                diVar.setItemCount(i3);
                eiVar.setItemCount(i3);
                hq7Var2.getLayoutParams().height = hl.L(42.0f) * i3;
                diVar.getLayoutParams().height = hl.L(42.0f) * i3;
                eiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 2:
                hi hiVar = (hi) hq7Var;
                fi fiVar = (fi) this.d;
                hq7 hq7Var3 = (hq7) obj;
                this.b = true;
                Point point2 = hl.q;
                i3 = point2.x > point2.y ? 3 : 5;
                hq7Var3.setItemCount(i3);
                fiVar.setItemCount(i3);
                hiVar.setItemCount(i3);
                hq7Var3.getLayoutParams().height = hl.L(42.0f) * i3;
                fiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                hiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 3:
                mi miVar = (mi) hq7Var;
                li liVar = (li) this.d;
                hq7 hq7Var4 = (hq7) obj;
                this.b = true;
                Point point3 = hl.q;
                i3 = point3.x > point3.y ? 3 : 5;
                hq7Var4.setItemCount(i3);
                liVar.setItemCount(i3);
                miVar.setItemCount(i3);
                hq7Var4.getLayoutParams().height = hl.L(42.0f) * i3;
                liVar.getLayoutParams().height = hl.L(42.0f) * i3;
                miVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 4:
                pi piVar = (pi) hq7Var;
                oi oiVar = (oi) this.d;
                hq7 hq7Var5 = (hq7) obj;
                this.b = true;
                Point point4 = hl.q;
                i3 = point4.x > point4.y ? 3 : 5;
                hq7Var5.setItemCount(i3);
                oiVar.setItemCount(i3);
                piVar.setItemCount(i3);
                hq7Var5.getLayoutParams().height = hl.L(42.0f) * i3;
                oiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                piVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 5:
                ui uiVar = (ui) this.d;
                ti tiVar = (ti) obj;
                this.b = true;
                Point point5 = hl.q;
                i3 = point5.x > point5.y ? 3 : 5;
                tiVar.setItemCount(i3);
                tiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                uiVar.setItemCount(i3);
                uiVar.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var.setItemCount(i3);
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 6:
                hq7 hq7Var6 = (hq7) this.d;
                hq7 hq7Var7 = (hq7) obj;
                this.b = true;
                Point point6 = hl.q;
                i3 = point6.x > point6.y ? 3 : 5;
                hq7Var7.setItemCount(i3);
                hq7Var6.setItemCount(i3);
                hq7Var.setItemCount(i3);
                hq7Var7.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var6.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            case 7:
                cj cjVar = (cj) hq7Var;
                bj bjVar = (bj) this.d;
                hq7 hq7Var8 = (hq7) obj;
                this.b = true;
                Point point7 = hl.q;
                i3 = point7.x > point7.y ? 3 : 5;
                hq7Var8.setItemCount(i3);
                bjVar.setItemCount(i3);
                cjVar.setItemCount(i3);
                hq7Var8.getLayoutParams().height = hl.L(42.0f) * i3;
                bjVar.getLayoutParams().height = hl.L(42.0f) * i3;
                cjVar.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 5:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 6:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 7:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(Context context, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, byte b) {
        super(context);
        this.a = b;
        this.c = hq7Var;
        this.d = hq7Var2;
        this.e = hq7Var3;
        this.b = false;
    }
}
