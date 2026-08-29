package ag;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f0 extends f3 {
    public static final /* synthetic */ int s = 0;
    public final v b;
    public final ImageView c;
    public final s d;
    public final Path e;
    public int f;
    public q0.a h;
    public z n;
    public boolean r;

    public f0(Context context, c6 c6Var) {
        super(context, c6Var, true, false);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new n(0, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(g6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new o(this, 0));
        s sVar = new s(this, context);
        this.d = sVar;
        sVar.d = Color.alpha(-65536) / 255.0f;
        sVar.a();
        sVar.invalidate();
        v vVar = new v(context, 0);
        vVar.setOrientation(1);
        y yVar = new y(this, context);
        vVar.b = yVar;
        yVar.a(this.f);
        vVar.c = new x(this, context);
        vVar.d = new e0(this, context);
        t tVar = new t(context, this.resourcesProvider);
        tVar.setAdapter(new u(vVar));
        vVar.addView(tVar, f6.l(1.0f, -1, 0));
        vVar.addView(sVar, f6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, f6.n(28, 28));
        linearLayout2.addView(tVar.n(8, false), f6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, f6.n(28, 28));
        vVar.addView(linearLayout2, f6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.b = vVar;
        linearLayout.addView(vVar, f6.n(-1, 0));
        r rVar = new r(this, context, linearLayout);
        rVar.addView(linearLayout);
        setCustomView(rVar);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f));
        }
    }

    public final void m(int i10, int i11) {
        View findFocus;
        if (!this.r) {
            if (i11 != 2) {
                return;
            } else {
                this.r = true;
            }
        }
        v vVar = this.b;
        if (i11 != 5 && (findFocus = vVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((y) vVar.b).a(i10);
        }
        if (i11 != 0) {
            x xVar = (x) vVar.c;
            boolean z10 = i11 != 1;
            xVar.n.f = i10;
            float[] fArr = xVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f9 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                xVar.d = f9 - (f10 <= 0.5f ? 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f) : th.b(1.0f, f10, 0.22f, 1.0f));
                xVar.e = fArr[0] / 360.0f;
            }
            xVar.invalidate();
        }
        if (i11 != 1) {
            s sVar = this.d;
            sVar.getClass();
            sVar.d = Color.alpha(i10) / 255.0f;
            sVar.a();
            sVar.invalidate();
        }
        e0 e0Var = (e0) vVar.d;
        e0Var.e = true;
        e0Var.a.b();
        e0Var.b.b();
        e0Var.c.b();
        EditTextBoldCursor editTextBoldCursor = e0Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(e0Var.f.f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        e0Var.e = false;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        if (!this.n.g()) {
            this.c.setVisibility(8);
        }
        super.show();
    }
}
