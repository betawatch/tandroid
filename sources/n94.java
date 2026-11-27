// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n94 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new n94());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        Drawable drawable;
        q94 q94Var = (q94) view;
        o94 o94Var = (o94) b8cVar.H;
        int i = q94.e;
        ArrayList arrayList = q94Var.d;
        int i2 = 0;
        if (arrayList != null) {
            ArrayList arrayList2 = o94Var.a;
            if (arrayList.equals(arrayList2)) {
                while (i2 < arrayList2.size()) {
                    int i3 = i2 + 1;
                    p94 p94Var = (p94) q94Var.getChildAt(i3);
                    int i4 = ((TL_feed.InterestCategory) arrayList2.get(i2)).id;
                    p94Var.a(o94Var.b.contains(Integer.valueOf(i4)), true);
                    p94Var.setOnClickListener(new w0(o94Var, i4, (byte) 7));
                    i2 = i3;
                }
                return;
            }
        }
        q94Var.d = new ArrayList(o94Var.a);
        while (q94Var.getChildCount() > 1) {
            q94Var.removeViewAt(q94Var.getChildCount() - 1);
        }
        ArrayList arrayList3 = o94Var.a;
        int size = arrayList3.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList3.get(i5);
            i5++;
            TL_feed.InterestCategory interestCategory = (TL_feed.InterestCategory) obj;
            p94 p94Var2 = new p94(q94Var, q94Var.getContext());
            p94Var2.setTextSize(13.0f);
            p94Var2.setTypeface(hl.o());
            p94Var2.setIncludeFontPadding(false);
            p94Var2.setGravity(17);
            p94Var2.setText(interestCategory.title);
            p94Var2.setPadding(hl.L(8.0f), 0, hl.L(11.0f), 0);
            if (interestCategory.emoji_document_id != 0) {
                ul ulVar = new ul(hl.L(19.0f), p94Var2);
                p94Var2.a = ulVar;
                ulVar.y = Integer.valueOf(q94Var.c);
                p94Var2.a.j(interestCategory.emoji_document_id, false);
                drawable = p94Var2.a;
            } else {
                String str = interestCategory.emoji;
                if (str != null) {
                    drawable = pv3.g(str);
                    if (drawable == null) {
                        drawable = pv3.g(interestCategory.emoji.replace("️", ""));
                    }
                    if (drawable == null) {
                        p94Var2.setText(interestCategory.emoji + " " + interestCategory.title);
                    }
                } else {
                    drawable = null;
                }
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, hl.L(19.0f), hl.L(19.0f));
                p94Var2.setCompoundDrawablesRelative(drawable, null, null, null);
                p94Var2.setCompoundDrawablePadding(hl.L(5.0f));
            }
            p94Var2.a(o94Var.b.contains(Integer.valueOf(interestCategory.id)), false);
            iye.a(p94Var2);
            p94Var2.setContentDescription(interestCategory.title);
            p94Var2.setOnClickListener(new je3(o94Var, interestCategory, (byte) 11));
            q94Var.addView(p94Var2);
        }
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        o94 o94Var = (o94) b8cVar.H;
        o94 o94Var2 = (o94) b8cVar2.H;
        return o94Var.a.equals(o94Var2.a) && o94Var.b.equals(o94Var2.b);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new q94(i, vnbVar, context);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return true;
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
