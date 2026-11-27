// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d91 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new d91());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        byte b2;
        boolean z2;
        SpannableString spannableString;
        int i;
        boolean z3;
        ?? r12;
        int i2;
        f91 f91Var = (f91) b8cVar.H;
        e91 e91Var = (e91) view;
        View.OnClickListener onClickListener = b8cVar.E;
        int i3 = e91Var.a;
        jc0 jc0Var = e91Var.b;
        bv8 bv8Var = e91Var.d;
        ImageView imageView = e91Var.c;
        boolean z4 = f91Var.e;
        ArrayList arrayList = f91Var.c;
        ArrayList arrayList2 = f91Var.b;
        imageView.setImageResource(z4 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = ob6.a0 ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder l = c00.l(str, "  ");
            b2 = 1;
            l.append(ob6.t(message.date));
            spannableString = new SpannableString(l.toString());
            z2 = false;
        } else {
            b2 = 1;
            z2 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), ob6.t(message.date)));
        }
        byte b3 = f91Var.d;
        Object obj = null;
        if (b3 != 0) {
            if (b3 == b2) {
                if (e91Var.h == null) {
                    Drawable mutate = e91Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i2 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    yob.x(bv8Var, mutate, aob.A6, null, PorterDuff.Mode.MULTIPLY);
                    e91Var.h = mutate;
                } else {
                    i2 = 0;
                }
                spannableString.setSpan(new ImageSpan(e91Var.h, i2), str.length(), str.length() + 1, 33);
            } else if (b3 == 2) {
                Drawable mutate2 = e91Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (b3 == 3) {
                Drawable mutate3 = e91Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z5 = z2;
                mutate3.setBounds(z5 ? 1 : 0, z5 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.r7, z5), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z5 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (e91Var.f == null) {
                Drawable mutate4 = e91Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                yob.x(bv8Var, mutate4, aob.A6, null, PorterDuff.Mode.MULTIPLY);
                e91Var.f = mutate4;
            } else {
                i = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(e91Var.f, i), str.length(), str.length() + 1, 33);
        }
        if (f91Var.a != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < Math.min(3, arrayList2.size()); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(wf3.t((TLObject) arrayList2.get(i4)));
            }
            if (arrayList2.size() > 3) {
                sb.append(" ");
                r12 = 0;
                sb.append(ob6.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(yac.h(i3).f());
            bv8Var.setAllowEmojiStatus(r12);
            bv8 bv8Var2 = e91Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            bv8Var2.C(obj, null, sb.toString(), spannableString, false, false);
            jc0Var.setVisibility(r12);
            bv8Var.r.f();
            bv8Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i5 = 0; i5 < min; i5++) {
                jc0Var.b(i5, i3, (TLObject) arrayList3.get(i5));
            }
            z3 = false;
            jc0Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z3 = false;
            bv8Var.setAllowEmojiStatus(true);
            bv8 bv8Var3 = e91Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            bv8Var3.C(obj, null, null, spannableString2, false, false);
            jc0Var.setVisibility(8);
            bv8Var.f = false;
        }
        imageView.setTag(f91Var);
        imageView.setOnClickListener(onClickListener);
        boolean z6 = b8cVar.e;
        og2 og2Var = e91Var.e;
        if (og2Var == null) {
            return;
        }
        og2Var.a(z6, z3);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new e91(context, i);
    }
}
