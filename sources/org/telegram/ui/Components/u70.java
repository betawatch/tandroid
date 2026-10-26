package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u70 extends lm0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final ig.a2 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ y70 n;

    public u70(y70 y70Var) {
        this.n = y70Var;
        ig.a2 a2Var = new ig.a2(false);
        this.e = a2Var;
        a2Var.a = new tv(this, 8);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        int size = this.c.size();
        ig.a2 a2Var = this.e;
        int size2 = a2Var.d.size();
        int size3 = a2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f = i11;
        return i11;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f - 1) {
            return 4;
        }
        return i10 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r13.toString().startsWith("@" + r4) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        CharSequence charSequence;
        long j10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        int size = this.c.size();
        ig.a2 a2Var = this.e;
        ArrayList arrayList = a2Var.e;
        ArrayList arrayList2 = a2Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i12 = i10 - 1;
        CharSequence charSequence2 = null;
        TLObject tLObject = (i12 < 0 || i12 >= size) ? (i12 < size || i12 >= size3 + size) ? (i12 <= size + size3 || i12 > (size2 + size) + size3) ? null : (TLObject) a2Var.e.get(((i12 - size) - size3) - 1) : (TLObject) arrayList2.get(i12 - size) : (TLObject) this.c.get(i12);
        if (tLObject != null) {
            String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
            if (i12 < size) {
                charSequence = (CharSequence) this.d.get(i12);
                if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i12 > size && !TextUtils.isEmpty(publicUsername)) {
                String str = a2Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) publicUsername);
                    int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                    if (indexOfIgnoreCase != -1) {
                        int length = str.length();
                        if (indexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            indexOfIgnoreCase++;
                        }
                        spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = publicUsername;
                }
            }
            Object object = k4Var.getObject();
            long j11 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            k4Var.d(tLObject, charSequence2, charSequence);
            j10 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j10 == 0) {
                y70 y70Var = this.n;
                a0.h hVar = y70Var.T;
                if (hVar == null || hVar.h(j10) < 0) {
                    k4Var.c(y70Var.f0.h(j10) >= 0, j11 == j10);
                    k4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    k4Var.c(true, j11 == j10);
                    k4Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = k4Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        k4Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j10 == 0) {
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.k4(context, 1, 0, false);
        } else if (i10 == 2) {
            view = new bi.cc(this, context, 19);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.e7, j4Var, null);
            Drawable drawable = j4Var.getResources().getDrawable(R.drawable.shadowdown);
            j4Var.a = drawable;
            org.telegram.ui.ActionBar.f7.y(j4Var, drawable, org.telegram.ui.ActionBar.y6.Zh, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(j4Var.getContext());
            j4Var.b = textView;
            ic.a.o(14.0f, 1, textView);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.ai, null);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            j4Var.addView(textView, gb1.h(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = j4Var;
        } else {
            view = new View(context);
        }
        return new vl0(view);
    }
}
