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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d60 extends bk0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final jg.z1 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ j60 n;

    public d60(j60 j60Var) {
        this.n = j60Var;
        jg.z1 z1Var = new jg.z1(false);
        this.e = z1Var;
        z1Var.a = new iy(this, 6);
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    @Override // v4.i0
    public final int b() {
        int size = this.c.size();
        jg.z1 z1Var = this.e;
        int size2 = z1Var.d.size();
        int size3 = z1Var.e.size();
        int i7 = size + size2;
        if (size3 != 0) {
            i7 += size3 + 1;
        }
        int i10 = i7 + 2;
        this.f = i10;
        return i10;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f - 1) {
            return 4;
        }
        return i7 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        CharSequence charSequence;
        long j3;
        int i10 = f1Var.f;
        View view = f1Var.a;
        CharSequence charSequence2 = null;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.h4) view).setText(org.telegram.messenger.gd.M0(2131749360, null));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        int size = this.c.size();
        jg.z1 z1Var = this.e;
        ArrayList arrayList = z1Var.e;
        ArrayList arrayList2 = z1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i11 = i7 - 1;
        TLObject tLObject = (i11 < 0 || i11 >= size) ? (i11 < size || i11 >= size3 + size) ? (i11 <= size + size3 || i11 > (size2 + size) + size3) ? null : (TLObject) z1Var.e.get(((i11 - size) - size3) - 1) : (TLObject) arrayList2.get(i11 - size) : (TLObject) this.c.get(i11);
        if (tLObject != null) {
            String K = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : org.telegram.messenger.v3.K((TLRPC.Chat) tLObject, false);
            if (i11 < size) {
                charSequence = (CharSequence) this.d.get(i11);
                if (charSequence != null && !TextUtils.isEmpty(K)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i11 > size && !TextUtils.isEmpty(K)) {
                String str = z1Var.c;
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
                        spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.q6, null), A1, length + A1, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = K;
                }
            }
            Object object = i4Var.getObject();
            long j10 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            i4Var.d(tLObject, charSequence2, charSequence);
            j3 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j3 == 0) {
                j60 j60Var = this.n;
                a0.h hVar = j60Var.O1;
                if (hVar == null || hVar.h(j3) < 0) {
                    i4Var.c(j60Var.a2.h(j3) >= 0, j10 == j3);
                    i4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    i4Var.c(true, j10 == j3);
                    i4Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = i4Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        i4Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j3 == 0) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        if (i7 == 1) {
            view = new org.telegram.ui.Cells.i4(context, 1, 0, false);
        } else if (i7 == 2) {
            view = new bi.i3(21, context, this);
        } else if (i7 != 4) {
            org.telegram.ui.Cells.h4 h4Var = new org.telegram.ui.Cells.h4(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.e7, h4Var, null);
            Drawable drawable = h4Var.getResources().getDrawable(R.drawable.shadowdown);
            h4Var.a = drawable;
            org.telegram.ui.ActionBar.u6.x(h4Var, drawable, org.telegram.ui.ActionBar.n6.Qi, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(h4Var.getContext());
            h4Var.b = textView;
            i5.c.x(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ri, null);
            textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            h4Var.addView(textView, c8.ma.d(-1, -1.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = h4Var;
        } else {
            view = new View(context);
        }
        return new kj0(view);
    }
}
