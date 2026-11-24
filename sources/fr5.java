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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fr5 extends n39 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final zr9 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ jr5 n;

    public fr5(jr5 jr5Var) {
        this.n = jr5Var;
        zr9 zr9Var = new zr9(false);
        this.e = zr9Var;
        zr9Var.a = new ry4((Object) this, (byte) 13);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    @Override // w39
    public final int b() {
        int size = this.c.size();
        zr9 zr9Var = this.e;
        int size2 = zr9Var.d.size();
        int size3 = zr9Var.e.size();
        int i = size + size2;
        if (size3 != 0) {
            i += size3 + 1;
        }
        int i2 = i + 2;
        this.f = i2;
        return i2;
    }

    @Override // w39
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        CharSequence charSequence;
        long j;
        zr9 zr9Var = this.e;
        ArrayList arrayList = zr9Var.d;
        ArrayList arrayList2 = zr9Var.e;
        int i2 = s49Var.f;
        View view = s49Var.a;
        CharSequence charSequence2 = null;
        if (i2 == 0) {
            ((xa5) view).setText(k96.M0(2131749360, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        za5 za5Var = (za5) view;
        int size = this.c.size();
        int size2 = arrayList2.size();
        int size3 = arrayList.size();
        int i3 = i - 1;
        TLObject tLObject = (i3 < 0 || i3 >= size) ? (i3 < size || i3 >= size3 + size) ? (i3 <= size + size3 || i3 > (size2 + size) + size3) ? null : (TLObject) arrayList2.get(((i3 - size) - size3) - 1) : (TLObject) arrayList.get(i3 - size) : (TLObject) this.c.get(i3);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : hc2.K((TLRPC.Chat) tLObject, false);
            if (i3 < size) {
                charSequence = (CharSequence) this.d.get(i3);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i3 > size && !TextUtils.isEmpty(K)) {
                String str = zr9Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) K);
                    int y1 = gl.y1(K, str);
                    if (y1 != -1) {
                        int length = str.length();
                        if (y1 == 0) {
                            length++;
                        } else {
                            y1++;
                        }
                        spannableStringBuilder.setSpan(new cm4(bkb.p6, null), y1, length + y1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = za5Var.getObject();
            long j2 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            za5Var.d(tLObject, charSequence2, charSequence);
            j = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j == 0) {
                jr5 jr5Var = this.n;
                vf6 vf6Var = jr5Var.N1;
                if (vf6Var == null || vf6Var.h(j) < 0) {
                    za5Var.c(jr5Var.Z1.h(j) >= 0, j2 == j);
                    za5Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    za5Var.c(true, j2 == j);
                    za5Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = za5Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        za5Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j == 0) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        if (i == 1) {
            view = new za5(context, 1, 0, false);
        } else if (i == 2) {
            view = new sb((byte) 17, context, this);
        } else if (i != 4) {
            xa5 xa5Var = new xa5(context);
            zkb.h(bkb.d7, null, xa5Var);
            Drawable drawable = xa5Var.getResources().getDrawable(R.drawable.shadowdown);
            xa5Var.a = drawable;
            zkb.x(xa5Var, drawable, bkb.Pi, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(xa5Var.getContext());
            xa5Var.b = textView;
            ir2.t(textView, 1, 14.0f);
            zkb.X(textView, bkb.Qi, null);
            textView.setGravity((k96.a0 ? 5 : 3) | 16);
            xa5Var.addView(textView, nme.d(-1, -1.0f, (k96.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = xa5Var;
        } else {
            view = new View(context);
        }
        return new y29(view);
    }
}
