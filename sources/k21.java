// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k21 extends g11 implements tjb {
    public final wjb a;
    public Runnable b;
    public Runnable c;
    public m21 d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public k21(wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        float f;
        this.a = wjbVar;
        int i = bkb.wj;
        int h = wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
        if (z) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(bkb.f0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            ir2.t(textView, 1, 14.0f);
            ug8.x(textView, i, wjbVar, null, 2131743646);
            textView.setGravity(16);
            float f2 = z2 ? 34.0f : 12.0f;
            if (k96.a0) {
                f = 12.0f;
            } else {
                f = f2;
                f2 = 12.0f;
            }
            txe.a(textView, f, 8.0f, f2, 8.0f);
            addView(textView, nme.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z2) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
            if (!z) {
                imageView.setBackground(bkb.f0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            txe.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, nme.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new j1(this, (byte) 22));
    }

    @Override // l11
    public final void c() {
        this.d = null;
        Runnable runnable = this.c;
        if (runnable == null || this.f) {
            return;
        }
        runnable.run();
    }

    @Override // l11
    public final void d(m21 m21Var) {
        this.d = m21Var;
    }

    public final void e(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f = true;
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
            m21 m21Var = this.d;
            if (m21Var != null) {
                m21Var.b();
            }
        }
    }

    @Override // tjb
    public final void updateColors() {
        Drawable drawable;
        try {
            int i = bkb.wj;
            wjb wjbVar = this.a;
            int h = ((wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                bkb.F1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                bkb.F1(drawable2, h, true);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public k21(wjb wjbVar, Context context, boolean z) {
        this(wjbVar, context, z, !z);
    }
}
