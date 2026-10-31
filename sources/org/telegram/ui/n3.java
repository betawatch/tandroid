package org.telegram.ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n3 implements bs0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ h4 c;

    public n3(h4 h4Var, TLRPC.WebPage webPage, List list) {
        this.c = h4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.bs0
    public final boolean a(int i10) {
        return i10 < this.b.size() && i10 >= 0 && e4.g(this.a, get(i10));
    }

    @Override // org.telegram.ui.bs0
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize w9;
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                TLRPC.Photo e = e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w9 = org.telegram.messenger.b8.w(e.sizes, org.telegram.messenger.i0.Z0(false), false, null, false)) != null) {
                    return e4.c(w9);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return e4.c(a2);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bs0
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.b8.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.b8.r(null, d);
    }

    @Override // org.telegram.ui.bs0
    public final TLObject d(int i10) {
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                return e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.bs0
    public final boolean e(int i10) {
        if (i10 < this.b.size() && i10 >= 0 && !e4.g(this.a, get(i10))) {
            f4 f4Var = this.c.u0[0].c;
            TL_iv.PageBlock pageBlock = get(i10);
            f4Var.getClass();
            if (f4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.bs0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w9;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w9 = org.telegram.messenger.b8.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i10 = w9.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return w9;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        if (w10 == null) {
            iArr[0] = -1;
            return null;
        }
        int i11 = w10.size;
        iArr[0] = i11;
        if (i11 == 0) {
            iArr[0] = -1;
        }
        return w10;
    }

    @Override // org.telegram.ui.bs0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.bs0
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.b.get(i10);
    }

    @Override // org.telegram.ui.bs0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.bs0
    public final void h(TL_iv.PageBlock pageBlock) {
        h4 h4Var = this.c;
        int childCount = h4Var.u0[0].b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h4Var.u0[0].b.getChildAt(i10);
            if (childAt instanceof o2) {
                o2 o2Var = (o2) childAt;
                int indexOf = o2Var.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    o2Var.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // org.telegram.ui.bs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence i(int i10) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new m3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                h4 h4Var = this.c;
                h4Var.getClass();
                TL_iv.RichText u10 = h4.u(2, pageBlock);
                CharSequence A = h4.A(h4Var, this.a, null, u10, u10, pageBlock, -org.telegram.messenger.i0.L(100.0f));
                if (!(A instanceof Spannable)) {
                    return A;
                }
                Spannable spannable = (Spannable) A;
                org.telegram.ui.Components.uz0[] uz0VarArr = (org.telegram.ui.Components.uz0[]) spannable.getSpans(0, A.length(), org.telegram.ui.Components.uz0.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A.toString());
                if (uz0VarArr != null && uz0VarArr.length > 0) {
                    for (int i11 = 0; i11 < uz0VarArr.length; i11++) {
                        spannableStringBuilder2.setSpan(new m3(this, uz0VarArr[i11].b, 1), spannable.getSpanStart(uz0VarArr[i11]), spannable.getSpanEnd(uz0VarArr[i11]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.bs0
    public final int j() {
        return this.b.size();
    }
}
