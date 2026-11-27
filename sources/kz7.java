// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kz7 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new kz7());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        lz7 lz7Var = (lz7) view;
        TL_account.Passkey passkey = (TL_account.Passkey) b8cVar.H;
        View.OnClickListener onClickListener = b8cVar.E;
        vnb vnbVar = lz7Var.d;
        FrameLayout frameLayout = lz7Var.e;
        de0 de0Var = lz7Var.f;
        lz7Var.w = passkey.id;
        long j = passkey.software_emoji_id;
        if (j != 0) {
            de0Var.setAnimatedEmojiDrawable(wl.m(lz7Var.c, j, null, 3));
            frameLayout.setBackground(null);
            de0Var.setColorFilter(null);
            lz7Var.a = false;
            de0Var.setScaleX(1.0f);
            de0Var.setScaleY(1.0f);
        } else {
            int L = hl.L(4.0f);
            int i = aob.G6;
            yob.B(frameLayout, aob.b0(L, aob.p1(0.04f, aob.v0(i, vnbVar))), yob.K(0.04f, i), vnbVar);
            lz7Var.a();
            de0Var.setImageResource(R.drawable.msg2_permissions);
            de0Var.setScaleX(0.666f);
            de0Var.setScaleY(0.666f);
            de0Var.setAnimatedEmojiDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(passkey.name);
        TextView textView = lz7Var.h;
        if (isEmpty) {
            textView.setText(ob6.M0(2131747355, null));
        } else {
            textView.setText(passkey.name);
        }
        int i2 = passkey.last_usage_date;
        TextView textView2 = lz7Var.n;
        if (i2 != 0) {
            textView2.setText(ob6.a0(null, null, 2131747361, ob6.x(i2, false)));
        } else {
            textView2.setText(ob6.a0(null, null, 2131747374, ob6.x(passkey.date, false)));
        }
        lz7Var.r.setOnClickListener(onClickListener);
        lz7Var.s = z;
        lz7Var.setWillNotDraw(!z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new lz7(i, vnbVar, context);
    }
}
