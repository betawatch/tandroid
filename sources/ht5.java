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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ht5 extends c79 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final sv9 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ lt5 n;

    public ht5(lt5 lt5Var) {
        this.n = lt5Var;
        sv9 sv9Var = new sv9(false);
        this.e = sv9Var;
        sv9Var.a = new e05((Object) this, (byte) 15);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    @Override // j79
    public final int b() {
        int size = this.c.size();
        sv9 sv9Var = this.e;
        int size2 = sv9Var.d.size();
        int size3 = sv9Var.e.size();
        int i = size + size2;
        if (size3 != 0) {
            i += size3 + 1;
        }
        int i2 = i + 2;
        this.f = i2;
        return i2;
    }

    @Override // j79
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        CharSequence charSequence;
        long j;
        sv9 sv9Var = this.e;
        ArrayList arrayList = sv9Var.d;
        ArrayList arrayList2 = sv9Var.e;
        int i2 = f89Var.f;
        View view = f89Var.a;
        CharSequence charSequence2 = null;
        if (i2 == 0) {
            ((yc5) view).setText(ob6.M0(2131749306, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                view.requestLayout();
                return;
            }
            return;
        }
        bd5 bd5Var = (bd5) view;
        int size = this.c.size();
        int size2 = arrayList2.size();
        int size3 = arrayList.size();
        int i3 = i - 1;
        TLObject tLObject = (i3 < 0 || i3 >= size) ? (i3 < size || i3 >= size3 + size) ? (i3 <= size + size3 || i3 > (size2 + size) + size3) ? null : (TLObject) arrayList2.get(((i3 - size) - size3) - 1) : (TLObject) arrayList.get(i3 - size) : (TLObject) this.c.get(i3);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : xc2.K((TLRPC.Chat) tLObject, false);
            if (i3 < size) {
                charSequence = (CharSequence) this.d.get(i3);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i3 > size && !TextUtils.isEmpty(K)) {
                String str = sv9Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) K);
                    int y1 = hl.y1(K, str);
                    if (y1 != -1) {
                        int length = str.length();
                        if (y1 == 0) {
                            length++;
                        } else {
                            y1++;
                        }
                        spannableStringBuilder.setSpan(new ho4(aob.q6, null), y1, length + y1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = bd5Var.getObject();
            long j2 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            bd5Var.d(tLObject, charSequence2, charSequence);
            j = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j == 0) {
                lt5 lt5Var = this.n;
                zh6 zh6Var = lt5Var.N1;
                if (zh6Var == null || zh6Var.h(j) < 0) {
                    bd5Var.c(lt5Var.Z1.h(j) >= 0, j2 == j);
                    bd5Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    bd5Var.c(true, j2 == j);
                    bd5Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = bd5Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        bd5Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j == 0) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        if (i == 1) {
            view = new bd5(context, 1, 0, false);
        } else if (i == 2) {
            view = new tb((byte) 18, context, this);
        } else if (i != 4) {
            yc5 yc5Var = new yc5(context);
            yob.h(aob.e7, null, yc5Var);
            Drawable drawable = yc5Var.getResources().getDrawable(R.drawable.shadowdown);
            yc5Var.a = drawable;
            yob.x(yc5Var, drawable, aob.Qi, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(yc5Var.getContext());
            yc5Var.b = textView;
            bs2.t(textView, 1, 14.0f);
            yob.X(textView, aob.Ri, null);
            textView.setGravity((ob6.a0 ? 5 : 3) | 16);
            yc5Var.addView(textView, tre.d(-1, -1.0f, (ob6.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = yc5Var;
        } else {
            view = new View(context);
        }
        return new n69(view);
    }
}
