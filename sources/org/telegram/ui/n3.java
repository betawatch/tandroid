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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n3 implements hq0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ i4 c;

    public n3(i4 i4Var, TLRPC.WebPage webPage, List list) {
        this.c = i4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.hq0
    public final boolean a(int i3) {
        return i3 < this.b.size() && i3 >= 0 && e4.g(this.a, get(i3));
    }

    @Override // org.telegram.ui.hq0
    public final File b(int i3) {
        TLRPC.Document a10;
        TLRPC.PhotoSize w10;
        if (i3 < this.b.size() && i3 >= 0) {
            TL_iv.PageBlock pageBlock = get(i3);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                TLRPC.Photo e10 = e4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (w10 = org.telegram.messenger.w7.w(e10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                    return e4.c(w10);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = e4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return e4.c(a10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.hq0
    public final String c(int i3) {
        TLObject d = d(i3);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override // org.telegram.ui.hq0
    public final TLObject d(int i3) {
        if (i3 < this.b.size() && i3 >= 0) {
            TL_iv.PageBlock pageBlock = get(i3);
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

    @Override // org.telegram.ui.hq0
    public final boolean e(int i3) {
        if (i3 < this.b.size() && i3 >= 0 && !e4.g(this.a, get(i3))) {
            g4 g4Var = this.c.v0[0].c;
            TL_iv.PageBlock pageBlock = get(i3);
            g4Var.getClass();
            if (g4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.hq0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w10;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i3 = w10.size;
            iArr[0] = i3;
            if (i3 == 0) {
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

    @Override // org.telegram.ui.hq0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.hq0
    public final TL_iv.PageBlock get(int i3) {
        return (TL_iv.PageBlock) this.b.get(i3);
    }

    @Override // org.telegram.ui.hq0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.hq0
    public final void h(TL_iv.PageBlock pageBlock) {
        i4 i4Var = this.c;
        int childCount = i4Var.v0[0].b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = i4Var.v0[0].b.getChildAt(i3);
            if (childAt instanceof p2) {
                p2 p2Var = (p2) childAt;
                int indexOf = p2Var.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    p2Var.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // org.telegram.ui.hq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence i(int i3) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i3);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new m3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                i4 i4Var = this.c;
                i4Var.getClass();
                TL_iv.RichText u10 = i4.u(2, pageBlock);
                CharSequence A = i4.A(i4Var, this.a, null, u10, u10, pageBlock, -org.telegram.messenger.g0.L(100.0f));
                if (!(A instanceof Spannable)) {
                    return A;
                }
                Spannable spannable = (Spannable) A;
                org.telegram.ui.Components.py0[] py0VarArr = (org.telegram.ui.Components.py0[]) spannable.getSpans(0, A.length(), org.telegram.ui.Components.py0.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A.toString());
                if (py0VarArr != null && py0VarArr.length > 0) {
                    for (int i10 = 0; i10 < py0VarArr.length; i10++) {
                        spannableStringBuilder2.setSpan(new m3(this, py0VarArr[i10].b, 1), spannable.getSpanStart(py0VarArr[i10]), spannable.getSpanEnd(py0VarArr[i10]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.hq0
    public final int j() {
        return this.b.size();
    }
}
