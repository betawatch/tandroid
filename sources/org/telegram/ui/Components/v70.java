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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v70 extends lm0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final hg.a2 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ z70 n;

    public v70(z70 z70Var) {
        this.n = z70Var;
        hg.a2 a2Var = new hg.a2(false);
        this.e = a2Var;
        a2Var.a = new xv(this, 8);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 1;
    }

    @Override // s4.g0
    public final int h() {
        int size = this.c.size();
        hg.a2 a2Var = this.e;
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

    @Override // s4.g0
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
    
        if (r13.toString().startsWith("@" + r5) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        CharSequence charSequence;
        long j10;
        int i11 = b1Var.f;
        View view = b1Var.a;
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
        hg.a2 a2Var = this.e;
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
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
                z70 z70Var = this.n;
                a0.h hVar = z70Var.T;
                if (hVar == null || hVar.h(j10) < 0) {
                    g4Var.c(z70Var.f0.h(j10) >= 0, j11 == j10);
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

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g4(1, 0, context, false);
        } else if (i10 == 2) {
            view = new di.ab(this, context, 19);
        } else if (i10 != 4) {
            org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context);
            f4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false));
            Drawable drawable = f4Var.getResources().getDrawable(R.drawable.shadowdown);
            f4Var.a = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Zh, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(f4Var.getContext());
            f4Var.b = textView;
            com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ai, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            f4Var.addView(textView, w7.z5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
            view = f4Var;
        } else {
            view = new View(context);
        }
        return new wl0(view);
    }
}
