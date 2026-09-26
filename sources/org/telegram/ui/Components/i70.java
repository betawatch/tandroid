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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class i70 extends vl0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final gg.c2 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ m70 n;

    public i70(m70 m70Var) {
        this.n = m70Var;
        gg.c2 c2Var = new gg.c2(false);
        this.e = c2Var;
        c2Var.a = new mv(this, 8);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        int size = this.c.size();
        gg.c2 c2Var = this.e;
        int size2 = c2Var.d.size();
        int size3 = c2Var.e.size();
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r13.toString().startsWith("@" + r5) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        CharSequence charSequence;
        long j3;
        int i11 = c1Var.f;
        View view = c1Var.a;
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
        gg.c2 c2Var = this.e;
        ArrayList arrayList = c2Var.e;
        ArrayList arrayList2 = c2Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i12 = i10 - 1;
        CharSequence charSequence2 = null;
        TLObject tLObject = (i12 < 0 || i12 >= size) ? (i12 < size || i12 >= size3 + size) ? (i12 <= size + size3 || i12 > (size2 + size) + size3) ? null : (TLObject) c2Var.e.get(((i12 - size) - size3) - 1) : (TLObject) arrayList2.get(i12 - size) : (TLObject) this.c.get(i12);
        if (tLObject != null) {
            String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
            if (i12 < size) {
                charSequence = (CharSequence) this.d.get(i12);
                if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i12 > size && !TextUtils.isEmpty(publicUsername)) {
                String str = c2Var.c;
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
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                    }
                    charSequence = spannableStringBuilder;
                } catch (Exception unused) {
                    charSequence = publicUsername;
                }
            }
            Object object = g4Var.getObject();
            long j10 = !(object instanceof TLRPC.User) ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            g4Var.d(tLObject, charSequence2, charSequence);
            j3 = !(tLObject instanceof TLRPC.User) ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            if (j3 == 0) {
                m70 m70Var = this.n;
                a0.i iVar = m70Var.T;
                if (iVar == null || iVar.h(j3) < 0) {
                    g4Var.c(m70Var.f0.h(j3) >= 0, j10 == j3);
                    g4Var.setCheckBoxEnabled(true);
                    return;
                } else {
                    g4Var.c(true, j10 == j3);
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
        if (j3 == 0) {
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        } else if (i10 == 2) {
            view = new ci.bb(this, context, 19);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context);
            f4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false));
            Drawable drawable = f4Var.getResources().getDrawable(R.drawable.shadowdown);
            f4Var.a = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Zh, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(f4Var.getContext());
            f4Var.b = textView;
            com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ai, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            f4Var.addView(textView, w7.y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = f4Var;
        } else {
            view = new View(context);
        }
        return new gl0(view);
    }
}
