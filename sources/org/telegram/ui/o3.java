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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o3 implements mu0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ j4 c;

    public o3(j4 j4Var, TLRPC.WebPage webPage, List list) {
        this.c = j4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.mu0
    public final boolean a(int i10) {
        return i10 < this.b.size() && i10 >= 0 && f4.g(this.a, get(i10));
    }

    @Override // org.telegram.ui.mu0
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                TLRPC.Photo e = f4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return f4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = f4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return f4.c(a2);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mu0
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override // org.telegram.ui.mu0
    public final TLObject d(int i10) {
        if (i10 < this.b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                return f4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return f4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mu0
    public final boolean e(int i10) {
        if (i10 < this.b.size() && i10 >= 0 && !f4.g(this.a, get(i10))) {
            h4 h4Var = this.c.u0[0].c;
            TL_iv.PageBlock pageBlock = get(i10);
            h4Var.getClass();
            if (h4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.mu0
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

    @Override // org.telegram.ui.mu0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.mu0
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.b.get(i10);
    }

    @Override // org.telegram.ui.mu0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.mu0
    public final void h(TL_iv.PageBlock pageBlock) {
        j4 j4Var = this.c;
        int childCount = j4Var.u0[0].b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = j4Var.u0[0].b.getChildAt(i10);
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
    @Override // org.telegram.ui.mu0
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
                spannableStringBuilder.setSpan(new n3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                j4 j4Var = this.c;
                j4Var.getClass();
                TL_iv.RichText w10 = j4.w(2, pageBlock);
                CharSequence C = j4.C(j4Var, this.a, null, w10, w10, pageBlock, -AndroidUtilities.dp(100.0f));
                if (!(C instanceof Spannable)) {
                    return C;
                }
                Spannable spannable = (Spannable) C;
                org.telegram.ui.Components.v11[] v11VarArr = (org.telegram.ui.Components.v11[]) spannable.getSpans(0, C.length(), org.telegram.ui.Components.v11.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C.toString());
                if (v11VarArr != null && v11VarArr.length > 0) {
                    for (int i11 = 0; i11 < v11VarArr.length; i11++) {
                        spannableStringBuilder2.setSpan(new n3(this, v11VarArr[i11].b, 1), spannable.getSpanStart(v11VarArr[i11]), spannable.getSpanEnd(v11VarArr[i11]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.mu0
    public final int j() {
        return this.b.size();
    }
}
