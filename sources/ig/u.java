package ig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends z2 {
    public static final /* synthetic */ int q1 = 0;
    public final ai.b i1;
    public final ImageView j1;
    public final l k1;
    public final Path l1;
    public int m1;
    public q0.a n1;
    public androidx.activity.o o1;
    public boolean p1;

    public u(Context context, p6 p6Var) {
        super(1, context, p6Var, true);
        this.l1 = new Path();
        P(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.j1 = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ag.t0(4, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(t6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ag.g(this, 7));
        l lVar = new l(this, context);
        this.k1 = lVar;
        lVar.c = Color.alpha(-65536) / 255.0f;
        lVar.a();
        lVar.invalidate();
        ai.b bVar = new ai.b(context, 1);
        bVar.setOrientation(1);
        q qVar = new q(this, context);
        bVar.b = qVar;
        qVar.a(this.m1);
        bVar.c = new p(this, context);
        bVar.d = new t(this, context);
        m mVar = new m(context, this.I0);
        mVar.setAdapter(new n(bVar, 0));
        bVar.addView(mVar, b6.l(1.0f, -1, 0));
        bVar.addView(lVar, b6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, b6.o(28, 28));
        linearLayout2.addView(mVar.n(8, false), b6.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, b6.o(28, 28));
        bVar.addView(linearLayout2, b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.i1 = bVar;
        linearLayout.addView(bVar, b6.o(-1, 0));
        k kVar = new k(this, context, linearLayout);
        kVar.addView(linearLayout);
        this.N = kVar;
    }

    public final void I0(int i10, int i11) {
        View findFocus;
        if (!this.p1) {
            if (i11 != 2) {
                return;
            } else {
                this.p1 = true;
            }
        }
        ai.b bVar = this.i1;
        if (i11 != 5 && (findFocus = bVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.i0.v1(findFocus);
        }
        if (i11 != 3) {
            ((q) bVar.b).a(i10);
        }
        if (i11 != 0) {
            p pVar = (p) bVar.c;
            boolean z10 = i11 != 1;
            pVar.n.m1 = i10;
            float[] fArr = pVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                pVar.d = f7 - (f10 <= 0.5f ? 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f) : sc.e.z(1.0f, f10, 0.22f, 1.0f));
                pVar.e = fArr[0] / 360.0f;
            }
            pVar.invalidate();
        }
        if (i11 != 1) {
            l lVar = this.k1;
            lVar.getClass();
            lVar.c = Color.alpha(i10) / 255.0f;
            lVar.a();
            lVar.invalidate();
        }
        t tVar = (t) bVar.d;
        tVar.e = true;
        tVar.a.b();
        tVar.b.b();
        tVar.c.b();
        EditTextBoldCursor editTextBoldCursor = tVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(tVar.f.m1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        tVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.n1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.m1));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        boolean z10;
        androidx.activity.o oVar = this.o1;
        switch (oVar.a) {
            case 3:
                if (((Bitmap) oVar.c) != null) {
                    z10 = true;
                    break;
                }
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            this.j1.setVisibility(8);
        }
        super.show();
    }
}
