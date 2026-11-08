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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class m3 implements qq0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ g4 c;

    public m3(g4 g4Var, TLRPC.WebPage webPage, List list) {
        this.c = g4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.qq0
    public final boolean a(int i7) {
        return i7 < this.b.size() && i7 >= 0 && d4.g(this.a, get(i7));
    }

    @Override // org.telegram.ui.qq0
    public final File b(int i7) {
        TLRPC.Document a10;
        TLRPC.PhotoSize w10;
        if (i7 < this.b.size() && i7 >= 0) {
            TL_iv.PageBlock pageBlock = get(i7);
            boolean z9 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z9) {
                TLRPC.Photo e10 = d4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    return d4.c(w10);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = d4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return d4.c(a10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0
    public final String c(int i7) {
        TLObject d = d(i7);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override // org.telegram.ui.qq0
    public final TLObject d(int i7) {
        if (i7 < this.b.size() && i7 >= 0) {
            TL_iv.PageBlock pageBlock = get(i7);
            boolean z9 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z9) {
                return d4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return d4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0
    public final boolean e(int i7) {
        if (i7 < this.b.size() && i7 >= 0 && !d4.g(this.a, get(i7))) {
            e4 e4Var = this.c.u0[0].c;
            TL_iv.PageBlock pageBlock = get(i7);
            e4Var.getClass();
            if (e4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.qq0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w10;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i7 = w10.size;
            iArr[0] = i7;
            if (i7 == 0) {
                iArr[0] = -1;
            }
            return w10;
        }
        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w11 == null) {
            iArr[0] = -1;
            return null;
        }
        int i10 = w11.size;
        iArr[0] = i10;
        if (i10 == 0) {
            iArr[0] = -1;
        }
        return w11;
    }

    @Override // org.telegram.ui.qq0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.qq0
    public final TL_iv.PageBlock get(int i7) {
        return (TL_iv.PageBlock) this.b.get(i7);
    }

    @Override // org.telegram.ui.qq0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.qq0
    public final void h(TL_iv.PageBlock pageBlock) {
        g4 g4Var = this.c;
        int childCount = g4Var.u0[0].b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = g4Var.u0[0].b.getChildAt(i7);
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
    @Override // org.telegram.ui.qq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence i(int i7) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i7);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new l3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                g4 g4Var = this.c;
                g4Var.getClass();
                TL_iv.RichText u10 = g4.u(2, pageBlock);
                CharSequence A = g4.A(g4Var, this.a, null, u10, u10, pageBlock, -org.telegram.messenger.g0.L(100.0f));
                if (!(A instanceof Spannable)) {
                    return A;
                }
                Spannable spannable = (Spannable) A;
                org.telegram.ui.Components.qy0[] qy0VarArr = (org.telegram.ui.Components.qy0[]) spannable.getSpans(0, A.length(), org.telegram.ui.Components.qy0.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A.toString());
                if (qy0VarArr != null && qy0VarArr.length > 0) {
                    for (int i10 = 0; i10 < qy0VarArr.length; i10++) {
                        spannableStringBuilder2.setSpan(new l3(this, qy0VarArr[i10].b, 1), spannable.getSpanStart(qy0VarArr[i10]), spannable.getSpanEnd(qy0VarArr[i10]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.qq0
    public final int j() {
        return this.b.size();
    }
}
