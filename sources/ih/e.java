package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import rf.w;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends View {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public e(ViewGroup viewGroup, int i10) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new mg0(this, 0);
        this.d = viewGroup;
        this.b = i10;
    }

    public void a() {
        mg0 mg0Var = (mg0) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.b;
        if (isEmpty && getVisibility() != 8) {
            zs.f(i10).e.remove(mg0Var);
            zs.f(i10).d(mg0Var);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            zs.f(i10).e.remove(mg0Var);
            setVisibility(0);
        }
    }

    public void b(f fVar, boolean z10) {
        f fVar2;
        f fVar3;
        ((fe.b) this.d).a(fVar != null, z10);
        if (isAttachedToWindow() && (fVar3 = (f) this.e) != null) {
            fVar3.b();
        }
        this.e = fVar;
        if (!isAttachedToWindow() || (fVar2 = (f) this.e) == null) {
            return;
        }
        fVar2.a(this);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                f fVar = (f) this.e;
                if (fVar != null) {
                    fVar.a(this);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                f fVar = (f) this.e;
                if (fVar != null) {
                    fVar.b();
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f7 = ((fe.b) this.d).e;
                if (f7 < 1.0f) {
                    canvas.save();
                    float f10 = 1.0f - f7;
                    canvas.scale(f10, f10, width, height);
                    ((Drawable) this.c).draw(canvas);
                    canvas.restore();
                }
                if (f7 > 0.0f) {
                    float f11 = this.b;
                    int L = i0.L(f11);
                    int width2 = (getWidth() - L) / 2;
                    int height2 = (getHeight() - L) / 2;
                    canvas.save();
                    canvas.translate(width2, height2);
                    canvas.scale(f7, f7, i0.L(f11) / 2.0f, i0.L(f11) / 2.0f);
                    f fVar = (f) this.e;
                    if (fVar != null) {
                        fVar.c(canvas, i0.L(f11), i0.L(f11));
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                w wVar = (w) this.d;
                p6 p6Var = (p6) this.c;
                int i10 = this.b;
                wVar.b(t6.r1(0.5f, t6.w0(i10, p6Var)));
                wVar.draw(canvas);
                w wVar2 = (w) this.e;
                wVar2.b(t6.r1(0.95f, t6.w0(i10, p6Var)));
                wVar2.draw(canvas);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.c;
                if (!arrayList.isEmpty()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((ng0) arrayList.get(i11)).a(canvas);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                int L = i0.L(24.0f);
                int i14 = (i10 - L) / 2;
                int i15 = (i11 - L) / 2;
                ((Drawable) this.c).setBounds(i14, i15, i14 + L, L + i15);
                break;
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                int i16 = i0.m;
                w wVar = (w) this.d;
                wVar.c(i0.L(12.0f) + i16, 0);
                wVar.setBounds(0, 0, i10, i0.L(52.0f) + i16);
                w wVar2 = (w) this.e;
                wVar2.c(i16 / 3, 0);
                wVar2.setBounds(0, 0, i10, i16);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    public e(Context context, int i10) {
        super(context);
        this.d = new fe.b(this, gr.h, 380L);
        this.b = i10;
        Drawable f7 = i0.a.f(context, R.drawable.outline_poll_attach_24);
        this.c = f7;
        a7.y(this, f7, t6.o7, null, PorterDuff.Mode.SRC_IN);
    }

    public e(int i10, Context context, p6 p6Var) {
        super(context);
        this.d = new w(2);
        this.e = new w(2);
        this.c = p6Var;
        this.b = i10;
    }
}
