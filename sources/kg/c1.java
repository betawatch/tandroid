package kg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.cz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends LinearLayout implements z5 {
    public ShapeDrawable a;
    public final e6 b;
    public final k9 c;
    public final u8 d;
    public final TextView e;
    public final TextView f;

    public c1(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.d = new u8((e6) null);
        this.b = e6Var;
        setOrientation(0);
        k9 k9Var = new k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, mf.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i3 = k6.G6;
        r6.V(textView, i3, e6Var);
        linearLayout.addView(textView, mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        r6.W(textView2, z10 ? r6.L(0.5f, i3) : r6.N(k6.z6), e6Var);
        linearLayout.addView(textView2, mf.o(-1, -2));
    }

    public final void a(int i3, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        k9 k9Var = this.c;
        if (i3 == 0) {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Ci, this.b));
            this.a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            xpVar.s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.e = L;
            xpVar.f = L2;
            k9Var.setImageDrawable(xpVar);
            textView2.setText(bd.a0(null, null, 2131749352, str));
            textView.setText(bd.M0(2131749353, null));
            return;
        }
        u8 u8Var = this.d;
        u8Var.q(chat);
        k9Var.e(chat, u8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.a0(null, null, 2131749350, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz(8);
        czVar.f = k6.x0(null, k6.zk, false);
        czVar.n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(bd.M0(2131749351, null));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.a;
            if (shapeDrawable != null) {
                k6.C1(k6.w0(k6.Ci, this.b), shapeDrawable);
                k9 k9Var = this.c;
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
