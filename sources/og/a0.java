package og;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.n3;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a0 extends h3 {
    public static final /* synthetic */ int s = 0;
    public final ci.h b;
    public final ImageView c;
    public final p d;
    public final Path e;
    public int f;
    public q0.a h;
    public v n;
    public boolean r;

    public a0(Context context, f6 f6Var) {
        super(1, context, f6Var, true);
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
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new n3(10, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ai.u(this, 25));
        p pVar = new p(this, context);
        this.d = pVar;
        pVar.d = Color.alpha(-65536) / 255.0f;
        pVar.a();
        pVar.invalidate();
        ci.h hVar = new ci.h(context, 2);
        hVar.setOrientation(1);
        u uVar = new u(this, context);
        hVar.d = uVar;
        uVar.a(this.f);
        hVar.b = new t(this, context);
        hVar.c = new z(this, context);
        q qVar = new q(context, this.resourcesProvider);
        qVar.setAdapter(new r(hVar));
        hVar.addView(qVar, a6.l(1.0f, -1, 0));
        hVar.addView(pVar, a6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, a6.n(28, 28));
        linearLayout2.addView(qVar.n(8, false), a6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, a6.n(28, 28));
        hVar.addView(linearLayout2, a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.b = hVar;
        linearLayout.addView(hVar, a6.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
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
        ci.h hVar = this.b;
        if (i11 != 5 && (findFocus = hVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((u) hVar.d).a(i10);
        }
        if (i11 != 0) {
            t tVar = (t) hVar.b;
            boolean z10 = i11 != 1;
            tVar.n.f = i10;
            float[] fArr = tVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                tVar.d = f7 - (f10 <= 0.5f ? 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f) : e2.a(1.0f, f10, 0.22f, 1.0f));
                tVar.e = fArr[0] / 360.0f;
            }
            tVar.invalidate();
        }
        if (i11 != 1) {
            p pVar = this.d;
            pVar.getClass();
            pVar.d = Color.alpha(i10) / 255.0f;
            pVar.a();
            pVar.invalidate();
        }
        z zVar = (z) hVar.c;
        zVar.e = true;
        zVar.a.b();
        zVar.b.b();
        zVar.c.b();
        EditTextBoldCursor editTextBoldCursor = zVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(zVar.f.f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        zVar.e = false;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        if (!this.n.g()) {
            this.c.setVisibility(8);
        }
        super.show();
    }
}
