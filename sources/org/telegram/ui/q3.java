package org.telegram.ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q3 implements dv0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ k4 c;

    public q3(k4 k4Var, TLRPC.WebPage webPage, List list) {
        this.c = k4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.dv0
    public final boolean a(int i10) {
        return i10 < this.b.size() && i10 >= 0 && h4.g(this.a, get(i10));
    }

    @Override // org.telegram.ui.dv0
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                TLRPC.Photo e = h4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return h4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = h4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return h4.c(a2);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.dv0
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override // org.telegram.ui.dv0
    public final TLObject d(int i10) {
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                return h4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return h4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.dv0
    public final boolean e(int i10) {
        if (i10 < this.b.size() && i10 >= 0 && !h4.g(this.a, get(i10))) {
            i4 i4Var = this.c.u0[0].c;
            TL_iv.PageBlock pageBlock = get(i10);
            i4Var.getClass();
            if (i4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.dv0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
                return null;
            }
            int i10 = closestPhotoSizeWithSize.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize2 == null) {
            iArr[0] = -1;
            return null;
        }
        int i11 = closestPhotoSizeWithSize2.size;
        iArr[0] = i11;
        if (i11 == 0) {
            iArr[0] = -1;
        }
        return closestPhotoSizeWithSize2;
    }

    @Override // org.telegram.ui.dv0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.dv0
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.b.get(i10);
    }

    @Override // org.telegram.ui.dv0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.dv0
    public final void h(TL_iv.PageBlock pageBlock) {
        k4 k4Var = this.c;
        int childCount = k4Var.u0[0].b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k4Var.u0[0].b.getChildAt(i10);
            if (childAt instanceof s2) {
                s2 s2Var = (s2) childAt;
                int indexOf = s2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    s2Var.a.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // org.telegram.ui.dv0
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
                spannableStringBuilder.setSpan(new p3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                k4 k4Var = this.c;
                k4Var.getClass();
                TL_iv.RichText w9 = k4.w(2, pageBlock);
                CharSequence C = k4.C(k4Var, this.a, null, w9, w9, pageBlock, -AndroidUtilities.dp(100.0f));
                if (!(C instanceof Spannable)) {
                    return C;
                }
                Spannable spannable = (Spannable) C;
                org.telegram.ui.Components.m11[] m11VarArr = (org.telegram.ui.Components.m11[]) spannable.getSpans(0, C.length(), org.telegram.ui.Components.m11.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C.toString());
                if (m11VarArr != null && m11VarArr.length > 0) {
                    for (int i11 = 0; i11 < m11VarArr.length; i11++) {
                        spannableStringBuilder2.setSpan(new p3(this, m11VarArr[i11].b, 1), spannable.getSpanStart(m11VarArr[i11]), spannable.getSpanEnd(m11VarArr[i11]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.dv0
    public final int j() {
        return this.b.size();
    }
}
