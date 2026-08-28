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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g60 extends vk0 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final of.v1 e;
    public int f;
    public Runnable h;
    public final /* synthetic */ k60 n;

    public g60(k60 k60Var) {
        this.n = k60Var;
        of.v1 v1Var = new of.v1(false);
        this.e = v1Var;
        v1Var.a = new wu(this, 7);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    @Override // f2.r0
    public final int h() {
        int size = this.c.size();
        of.v1 v1Var = this.e;
        int size2 = v1Var.d.size();
        int size3 = v1Var.e.size();
        int i9 = size + size2;
        if (size3 != 0) {
            i9 += size3 + 1;
        }
        int i10 = i9 + 2;
        this.f = i10;
        return i10;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        if (i9 == this.f - 1) {
            return 4;
        }
        return i9 + (-1) == this.e.d.size() + this.c.size() ? 0 : 1;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        CharSequence charSequence;
        long j10;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.f4) view).setText(LocaleController.getString(R.string.GlobalSearch));
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            view.requestLayout();
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int size = this.c.size();
        of.v1 v1Var = this.e;
        ArrayList arrayList = v1Var.e;
        ArrayList arrayList2 = v1Var.d;
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        int i11 = i9 - 1;
        CharSequence charSequence2 = null;
        TLObject tLObject = (i11 < 0 || i11 >= size) ? (i11 < size || i11 >= size3 + size) ? (i11 <= size + size3 || i11 > (size2 + size) + size3) ? null : (TLObject) v1Var.e.get(((i11 - size) - size3) - 1) : (TLObject) arrayList2.get(i11 - size) : (TLObject) this.c.get(i11);
        if (tLObject != null) {
            String publicUsername = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).username : ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
            if (i11 < size) {
                charSequence = (CharSequence) this.d.get(i11);
                if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                }
                charSequence2 = charSequence;
                charSequence = null;
            } else if (i11 > size && !TextUtils.isEmpty(publicUsername)) {
                String str = v1Var.c;
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
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
                k60 k60Var = this.n;
                a0.h hVar = k60Var.P;
                if (hVar == null || hVar.h(j10) < 0) {
                    g4Var.c(k60Var.b0.h(j10) >= 0, j11 == j10);
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

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = viewGroup.getContext();
        if (i9 == 1) {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        } else if (i9 == 2) {
            view = new fh.l2(this, context, 18);
        } else if (i9 != 4) {
            org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context);
            f4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e7, false));
            Drawable drawable = f4Var.getResources().getDrawable(R.drawable.shadowdown);
            f4Var.a = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Zh, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(f4Var.getContext());
            f4Var.b = textView;
            j3.r0.u(14.0f, 1, textView);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ai, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            f4Var.addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
            view = f4Var;
        } else {
            view = new View(context);
        }
        return new ik0(view);
    }
}
