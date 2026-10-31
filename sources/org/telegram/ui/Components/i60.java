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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i60 extends sk0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final zf.m1 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ m60 n;

    public i60(m60 m60Var) {
        this.n = m60Var;
        zf.m1 m1Var = new zf.m1(false);
        this.e = m1Var;
        m1Var.a = new px(this, 7);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.g0
    public final int b() {
        int size = this.c.size();
        zf.m1 m1Var = this.e;
        int size2 = m1Var.d.size();
        int size3 = m1Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f = i11;
        return i11;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f - 1) {
            return 4;
        }
        return i10 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r13.toString().startsWith("@" + r6) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        CharSequence charSequence;
        long j10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        CharSequence charSequence2 = null;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.i4) view).setText(org.telegram.messenger.cd.L0(2131749544, null));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        int size = this.c.size();
        zf.m1 m1Var = this.e;
        ArrayList arrayList = m1Var.e;
        ArrayList arrayList2 = m1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i12 = i10 - 1;
        TLObject tLObject = (i12 < 0 || i12 >= size) ? (i12 < size || i12 >= size3 + size) ? (i12 <= size + size3 || i12 > (size2 + size) + size3) ? null : (TLObject) m1Var.e.get(((i12 - size) - size3) - 1) : (TLObject) arrayList2.get(i12 - size) : (TLObject) this.c.get(i12);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : org.telegram.messenger.w3.K((TLRPC.Chat) tLObject, false);
            if (i12 < size) {
                charSequence = (CharSequence) this.d.get(i12);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i12 > size && !TextUtils.isEmpty(K)) {
                String str = m1Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) K);
                    int A1 = org.telegram.messenger.i0.A1(K, str);
                    if (A1 != -1) {
                        int length = str.length();
                        if (A1 == 0) {
                            length++;
                        } else {
                            A1++;
                        }
                        spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, null), A1, length + A1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = j4Var.getObject();
            long j11 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            j4Var.d(tLObject, charSequence2, charSequence);
            j10 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j10 == 0) {
                m60 m60Var = this.n;
                a0.h hVar = m60Var.K1;
                if (hVar == null || hVar.h(j10) < 0) {
                    j4Var.c(m60Var.W1.h(j10) >= 0, j11 == j10);
                    j4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    j4Var.c(true, j11 == j10);
                    j4Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = j4Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        j4Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j10 == 0) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.j4(context, 1, 0, false);
        } else if (i10 == 2) {
            view = new bi.t0(this, context, 15);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.i4 i4Var = new org.telegram.ui.Cells.i4(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, i4Var, null);
            Drawable drawable = i4Var.getResources().getDrawable(R.drawable.shadowdown);
            i4Var.a = drawable;
            org.telegram.ui.ActionBar.a7.y(i4Var, drawable, org.telegram.ui.ActionBar.t6.Ni, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(i4Var.getContext());
            i4Var.b = textView;
            sc.e.t(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Oi, null);
            textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            i4Var.addView(textView, w7.b6.d(-1, -1.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = i4Var;
        } else {
            view = new View(context);
        }
        return new ck0(view);
    }
}
