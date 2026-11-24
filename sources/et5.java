// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class et5 extends q59 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final bu9 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ it5 n;

    public et5(it5 it5Var) {
        this.n = it5Var;
        bu9 bu9Var = new bu9(false);
        this.e = bu9Var;
        bu9Var.a = new wx4((Object) this, (byte) 16);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    @Override // y59
    public final int b() {
        int size = this.c.size();
        bu9 bu9Var = this.e;
        int size2 = bu9Var.d.size();
        int size3 = bu9Var.e.size();
        int i = size + size2;
        if (size3 != 0) {
            i += size3 + 1;
        }
        int i2 = i + 2;
        this.f = i2;
        return i2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.f - 1) {
            return 4;
        }
        return i + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r13.toString().startsWith("@" + r6) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        CharSequence charSequence;
        long j;
        bu9 bu9Var = this.e;
        ArrayList arrayList = bu9Var.d;
        ArrayList arrayList2 = bu9Var.e;
        int i2 = u69Var.f;
        View view = u69Var.a;
        CharSequence charSequence2 = null;
        if (i2 == 0) {
            ((vc5) view).setText(jb6.M0(2131749309, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        xc5 xc5Var = (xc5) view;
        int size = this.c.size();
        int size2 = arrayList2.size();
        int size3 = arrayList.size();
        int i3 = i - 1;
        TLObject tLObject = (i3 < 0 || i3 >= size) ? (i3 < size || i3 >= size3 + size) ? (i3 <= size + size3 || i3 > (size2 + size) + size3) ? null : (TLObject) arrayList2.get(((i3 - size) - size3) - 1) : (TLObject) arrayList.get(i3 - size) : (TLObject) this.c.get(i3);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : sd2.K((TLRPC.Chat) tLObject, false);
            if (i3 < size) {
                charSequence = (CharSequence) this.d.get(i3);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i3 > size && !TextUtils.isEmpty(K)) {
                String str = bu9Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) K);
                    int y1 = gm.y1(K, str);
                    if (y1 != -1) {
                        int length = str.length();
                        if (y1 == 0) {
                            length++;
                        } else {
                            y1++;
                        }
                        spannableStringBuilder.setSpan(new do4(cmb.p6, null), y1, length + y1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = xc5Var.getObject();
            long j2 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            xc5Var.d(tLObject, charSequence2, charSequence);
            j = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j == 0) {
                it5 it5Var = this.n;
                vh6 vh6Var = it5Var.N1;
                if (vh6Var == null || vh6Var.h(j) < 0) {
                    xc5Var.c(it5Var.Z1.h(j) >= 0, j2 == j);
                    xc5Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    xc5Var.c(true, j2 == j);
                    xc5Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = xc5Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        xc5Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j == 0) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        if (i == 1) {
            view = new xc5(context, 1, 0, false);
        } else if (i == 2) {
            view = new sb((byte) 18, context, this);
        } else if (i != 4) {
            vc5 vc5Var = new vc5(context);
            anb.h(cmb.d7, null, vc5Var);
            Drawable drawable = vc5Var.getResources().getDrawable(R.drawable.shadowdown);
            vc5Var.a = drawable;
            anb.x(vc5Var, drawable, cmb.Pi, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(vc5Var.getContext());
            vc5Var.b = textView;
            ts2.s(textView, 1, 14.0f);
            anb.X(textView, cmb.Qi, null);
            textView.setGravity((jb6.a0 ? 5 : 3) | 16);
            vc5Var.addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = vc5Var;
        } else {
            view = new View(context);
        }
        return new b59(view);
    }
}
