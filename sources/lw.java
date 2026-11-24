// default package

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lw implements l98 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ o c;

    public lw(o oVar, TLRPC.WebPage webPage, List list) {
        this.c = oVar;
        this.a = webPage;
        this.b = list;
    }

    @Override // l98
    public final boolean a(int i) {
        return i < this.b.size() && i >= 0 && cx.g(this.a, get(i));
    }

    @Override // l98
    public final File b(int i) {
        TLRPC.Document a;
        TLRPC.PhotoSize w;
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                TLRPC.Photo e = cx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w = ba4.w(e.sizes, gl.Y0(false), false, null, false)) != null) {
                    return cx.c(w);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a = cx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return cx.c(a);
            }
        }
        return null;
    }

    @Override // l98
    public final String c(int i) {
        TLObject d = d(i);
        if (d instanceof TLRPC.Photo) {
            d = ba4.w(((TLRPC.Photo) d).sizes, gl.Y0(false), false, null, false);
        }
        return ba4.r(null, d);
    }

    @Override // l98
    public final TLObject d(int i) {
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                return cx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return cx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // l98
    public final boolean e(int i) {
        if (i < this.b.size() && i >= 0 && !cx.g(this.a, get(i))) {
            dx dxVar = this.c.v0[0].c;
            TL_iv.PageBlock pageBlock = get(i);
            dxVar.getClass();
            if (dx.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // l98
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w = ba4.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i = w.size;
            iArr[0] = i;
            if (i == 0) {
                iArr[0] = -1;
            }
            return w;
        }
        TLRPC.PhotoSize w2 = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
        if (w2 == null) {
            iArr[0] = -1;
            return null;
        }
        int i2 = w2.size;
        iArr[0] = i2;
        if (i2 == 0) {
            iArr[0] = -1;
        }
        return w2;
    }

    @Override // l98
    public final Object g() {
        return this.a;
    }

    @Override // l98
    public final TL_iv.PageBlock get(int i) {
        return (TL_iv.PageBlock) this.b.get(i);
    }

    @Override // l98
    public final List getAll() {
        return this.b;
    }

    @Override // l98
    public final void h(TL_iv.PageBlock pageBlock) {
        o oVar = this.c;
        int childCount = oVar.v0[0].b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = oVar.v0[0].b.getChildAt(i);
            if (childAt instanceof pv) {
                pv pvVar = (pv) childAt;
                int indexOf = pvVar.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    pvVar.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // l98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence i(int i) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i);
        Object[] objArr = 0;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new kw(this, str, objArr == true ? 1 : 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                o oVar = this.c;
                oVar.getClass();
                TL_iv.RichText t = o.t(2, pageBlock);
                CharSequence z = o.z(oVar, this.a, null, t, t, pageBlock, -gl.L(100.0f));
                if (!(z instanceof Spannable)) {
                    return z;
                }
                Spannable spannable = (Spannable) z;
                thb[] thbVarArr = (thb[]) spannable.getSpans(0, z.length(), thb.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z.toString());
                if (thbVarArr != null && thbVarArr.length > 0) {
                    for (int i2 = 0; i2 < thbVarArr.length; i2++) {
                        spannableStringBuilder2.setSpan(new kw(this, thbVarArr[i2].b, (byte) 1), spannable.getSpanStart(thbVarArr[i2]), spannable.getSpanEnd(thbVarArr[i2]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // l98
    public final int j() {
        return this.b.size();
    }
}
