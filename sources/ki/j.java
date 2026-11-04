package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends LinearLayout implements z5 {
    public final e6 a;
    public final y90 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.a = e6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        y90 y90Var = new y90(1);
        this.b = y90Var;
        frameLayout.setBackground(y90Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, mf.e(24, 24, 17));
        LinearLayout f10 = k5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = q.f(f10, textView, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f11;
        f11.setGravity(17);
        f11.setMinWidth(g0.L(20.66f));
        f11.setPadding(g0.L(6.33f), 0, g0.L(6.33f), 0);
        f11.setTextSize(1, 16.0f);
        if (bd.a0) {
            addView(f11, mf.j(13.33f, 0.0f));
            addView(f10, mf.q(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, mf.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, mf.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(f10, mf.q(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(f11, mf.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i3, int i10, int i11, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i11 != 0 ? 0 : 8);
        this.e.setTranslationX(i11 == 0 ? g0.L(2.0f) : 0.0f);
        this.b.b(i3, i10);
        this.d.setImageResource(i11);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f10 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z10 ? g0.o() : null);
            int i3 = z10 ? k6.W8 : k6.n6;
            e6 e6Var = this.a;
            r6.V(textView, i3, e6Var);
            textView.setBackground(z10 ? k6.d0(g0.L(10.33f), k6.w0(k6.U8, e6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i3 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i3);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = k6.G6;
        e6 e6Var = this.a;
        this.e.setTextColor(k6.w0(i3, e6Var));
        int w02 = k6.w0(this.n ? k6.W8 : k6.n6, e6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? k6.d0(g0.L(10.33f), k6.w0(k6.U8, e6Var)) : null);
        this.b.b = e6Var != null ? e6Var.a() : k6.I.q();
    }
}
