package ji;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j extends LinearLayout implements p6 {
    public final u6 a;
    public final jc0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, u6 u6Var, boolean z10) {
        super(context);
        this.a = u6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        jc0 jc0Var = new jc0(1);
        this.b = jc0Var;
        frameLayout.setBackground(jc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, kb1.i(24, 24, 17));
        LinearLayout d = wh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = wh.e(d, textView, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = e;
        e.setGravity(17);
        e.setMinWidth(AndroidUtilities.dp(20.66f));
        e.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        e.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(e, kb1.n(13.33f, 0.0f));
            addView(d, kb1.t(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, kb1.x(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, kb1.x(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(d, kb1.t(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(e, kb1.n(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i12 != 0 ? 0 : 8);
        this.e.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f7 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f7);
            textView.setTypeface(z10 ? AndroidUtilities.bold() : null);
            int i10 = z10 ? y6.W8 : y6.n6;
            u6 u6Var = this.a;
            f7.V(textView, i10, u6Var);
            textView.setBackground(z10 ? y6.c0(AndroidUtilities.dp(10.33f), y6.w0(y6.U8, u6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = y6.G6;
        u6 u6Var = this.a;
        this.e.setTextColor(y6.w0(i10, u6Var));
        int w02 = y6.w0(this.n ? y6.W8 : y6.n6, u6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? y6.c0(AndroidUtilities.dp(10.33f), y6.w0(y6.U8, u6Var)) : null);
        this.b.b = u6Var != null ? u6Var.a() : y6.I.q();
    }
}
