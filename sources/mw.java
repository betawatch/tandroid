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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mw implements bd8 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ o c;

    public mw(o oVar, TLRPC.WebPage webPage, List list) {
        this.c = oVar;
        this.a = webPage;
        this.b = list;
    }

    @Override // bd8
    public final boolean a(int i) {
        return i < this.b.size() && i >= 0 && dx.g(this.a, get(i));
    }

    @Override // bd8
    public final File b(int i) {
        TLRPC.Document a;
        TLRPC.PhotoSize w;
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                TLRPC.Photo e = dx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w = xb4.w(e.sizes, hl.Y0(false), false, null, false)) != null) {
                    return dx.c(w);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a = dx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return dx.c(a);
            }
        }
        return null;
    }

    @Override // bd8
    public final String c(int i) {
        TLObject d = d(i);
        if (d instanceof TLRPC.Photo) {
            d = xb4.w(((TLRPC.Photo) d).sizes, hl.Y0(false), false, null, false);
        }
        return xb4.r(null, d);
    }

    @Override // bd8
    public final TLObject d(int i) {
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                return dx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return dx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // bd8
    public final boolean e(int i) {
        if (i < this.b.size() && i >= 0 && !dx.g(this.a, get(i))) {
            ex exVar = this.c.v0[0].c;
            TL_iv.PageBlock pageBlock = get(i);
            exVar.getClass();
            if (ex.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // bd8
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w = xb4.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i = w.size;
            iArr[0] = i;
            if (i == 0) {
                iArr[0] = -1;
            }
            return w;
        }
        TLRPC.PhotoSize w2 = xb4.w(((TLRPC.Photo) tLObject).sizes, hl.Y0(false), false, null, false);
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

    @Override // bd8
    public final Object g() {
        return this.a;
    }

    @Override // bd8
    public final TL_iv.PageBlock get(int i) {
        return (TL_iv.PageBlock) this.b.get(i);
    }

    @Override // bd8
    public final List getAll() {
        return this.b;
    }

    @Override // bd8
    public final void h(TL_iv.PageBlock pageBlock) {
        o oVar = this.c;
        int childCount = oVar.v0[0].b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = oVar.v0[0].b.getChildAt(i);
            if (childAt instanceof qv) {
                qv qvVar = (qv) childAt;
                int indexOf = qvVar.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    qvVar.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // bd8
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
                spannableStringBuilder.setSpan(new lw(this, str, objArr == true ? 1 : 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                o oVar = this.c;
                oVar.getClass();
                TL_iv.RichText t = o.t(2, pageBlock);
                CharSequence z = o.z(oVar, this.a, null, t, t, pageBlock, -hl.L(100.0f));
                if (!(z instanceof Spannable)) {
                    return z;
                }
                Spannable spannable = (Spannable) z;
                plb[] plbVarArr = (plb[]) spannable.getSpans(0, z.length(), plb.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z.toString());
                if (plbVarArr != null && plbVarArr.length > 0) {
                    for (int i2 = 0; i2 < plbVarArr.length; i2++) {
                        spannableStringBuilder2.setSpan(new lw(this, plbVarArr[i2].b, (byte) 1), spannable.getSpanStart(plbVarArr[i2]), spannable.getSpanEnd(plbVarArr[i2]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // bd8
    public final int j() {
        return this.b.size();
    }
}
