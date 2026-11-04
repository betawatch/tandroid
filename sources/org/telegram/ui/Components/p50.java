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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p50 extends sj0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final kg.v1 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ t50 n;

    public p50(t50 t50Var) {
        this.n = t50Var;
        kg.v1 v1Var = new kg.v1(false);
        this.e = v1Var;
        v1Var.a = new zw(this, 7);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 1;
    }

    @Override // u4.h0
    public final int b() {
        int size = this.c.size();
        kg.v1 v1Var = this.e;
        int size2 = v1Var.d.size();
        int size3 = v1Var.e.size();
        int i3 = size + size2;
        if (size3 != 0) {
            i3 += size3 + 1;
        }
        int i10 = i3 + 2;
        this.f = i10;
        return i10;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == this.f - 1) {
            return 4;
        }
        return i3 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        CharSequence charSequence;
        long j10;
        int i10 = d1Var.f;
        View view = d1Var.a;
        CharSequence charSequence2 = null;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.g4) view).setText(org.telegram.messenger.bd.M0(2131749543, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        int size = this.c.size();
        kg.v1 v1Var = this.e;
        ArrayList arrayList = v1Var.e;
        ArrayList arrayList2 = v1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i11 = i3 - 1;
        TLObject tLObject = (i11 < 0 || i11 >= size) ? (i11 < size || i11 >= size3 + size) ? (i11 <= size + size3 || i11 > (size2 + size) + size3) ? null : (TLObject) v1Var.e.get(((i11 - size) - size3) - 1) : (TLObject) arrayList2.get(i11 - size) : (TLObject) this.c.get(i11);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
            if (i11 < size) {
                charSequence = (CharSequence) this.d.get(i11);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i11 > size && !TextUtils.isEmpty(K)) {
                String str = v1Var.c;
                if (str.startsWith("@")) {
                    str = str.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) K);
                    int A1 = org.telegram.messenger.g0.A1(K, str);
                    if (A1 != -1) {
                        int length = str.length();
                        if (A1 == 0) {
                            length++;
                        } else {
                            A1++;
                        }
                        spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.q6, null), A1, length + A1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = h4Var.getObject();
            long j11 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            h4Var.d(tLObject, charSequence2, charSequence);
            j10 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j10 == 0) {
                t50 t50Var = this.n;
                a0.h hVar = t50Var.L1;
                if (hVar == null || hVar.h(j10) < 0) {
                    h4Var.c(t50Var.X1.h(j10) >= 0, j11 == j10);
                    h4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    h4Var.c(true, j11 == j10);
                    h4Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = h4Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        h4Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j10 == 0) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        if (i3 == 1) {
            view = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        } else if (i3 == 2) {
            view = new ai.x2(21, context, this);
        } else if (i3 != 4) {
            org.telegram.ui.Cells.g4 g4Var = new org.telegram.ui.Cells.g4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, g4Var, null);
            Drawable drawable = g4Var.getResources().getDrawable(R.drawable.shadowdown);
            g4Var.a = drawable;
            org.telegram.ui.ActionBar.r6.y(g4Var, drawable, org.telegram.ui.ActionBar.k6.Ni, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(g4Var.getContext());
            g4Var.b = textView;
            k2.p1.t(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Oi, null);
            textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            g4Var.addView(textView, b8.mf.d(-1, -1.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = g4Var;
        } else {
            view = new View(context);
        }
        return new bj0(view);
    }
}
