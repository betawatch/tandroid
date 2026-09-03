package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a70 extends rl0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final uf.k1 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ e70 n;

    public a70(e70 e70Var) {
        this.n = e70Var;
        uf.k1 k1Var = new uf.k1(false);
        this.e = k1Var;
        k1Var.a = new hv(this, 7);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    @Override // f2.p0
    public final int h() {
        int size = this.c.size();
        uf.k1 k1Var = this.e;
        int size2 = k1Var.d.size();
        int size3 = k1Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f = i11;
        return i11;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f - 1) {
            return 4;
        }
        return i10 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r13.toString().startsWith("@" + r5) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        CharSequence charSequence;
        long j10;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.f4) view).setText(LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int size = this.c.size();
        uf.k1 k1Var = this.e;
        ArrayList arrayList = k1Var.e;
        ArrayList arrayList2 = k1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i12 = i10 - 1;
        CharSequence charSequence2 = null;
        TLObject tLObject = (i12 < 0 || i12 >= size) ? (i12 < size || i12 >= size3 + size) ? (i12 <= size + size3 || i12 > (size2 + size) + size3) ? null : (TLObject) k1Var.e.get(((i12 - size) - size3) - 1) : (TLObject) arrayList2.get(i12 - size) : (TLObject) this.c.get(i12);
        if (tLObject != null) {
            String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
            if (i12 < size) {
                charSequence = (CharSequence) this.d.get(i12);
                if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i12 > size && !TextUtils.isEmpty(publicUsername)) {
                String str = k1Var.c;
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
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = publicUsername;
                }
            }
            Object object = g4Var.getObject();
            long j11 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            g4Var.d(tLObject, charSequence2, charSequence);
            j10 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j10 == 0) {
                e70 e70Var = this.n;
                a0.h hVar = e70Var.Q;
                if (hVar == null || hVar.h(j10) < 0) {
                    g4Var.c(e70Var.c0.h(j10) >= 0, j11 == j10);
                    g4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    g4Var.c(true, j11 == j10);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
            }
            return;
        }
        charSequence = null;
        Object object2 = g4Var.getObject();
        if (!(object2 instanceof TLRPC.User)) {
        }
        g4Var.d(tLObject, charSequence2, charSequence);
        if (!(tLObject instanceof TLRPC.User)) {
        }
        if (j10 == 0) {
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        } else if (i10 == 2) {
            view = new fg.h0(this, context, 14);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context);
            f4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.e7, false));
            Drawable drawable = f4Var.getResources().getDrawable(R.drawable.shadowdown);
            f4Var.a = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Zh, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(f4Var.getContext());
            f4Var.b = textView;
            org.telegram.ui.yh.p(14.0f, 1, textView);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ai, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            f4Var.addView(textView, k7.c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = f4Var;
        } else {
            view = new View(context);
        }
        return new el0(view);
    }
}
