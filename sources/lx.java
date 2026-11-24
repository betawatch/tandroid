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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lx implements mb8 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ o c;

    public lx(o oVar, TLRPC.WebPage webPage, List list) {
        this.c = oVar;
        this.a = webPage;
        this.b = list;
    }

    @Override // mb8
    public final boolean a(int i) {
        return i < this.b.size() && i >= 0 && dy.g(this.a, get(i));
    }

    @Override // mb8
    public final File b(int i) {
        TLRPC.Document a;
        TLRPC.PhotoSize w;
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                TLRPC.Photo e = dy.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w = bc4.w(e.sizes, gm.Y0(false), false, null, false)) != null) {
                    return dy.c(w);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a = dy.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return dy.c(a);
            }
        }
        return null;
    }

    @Override // mb8
    public final String c(int i) {
        TLObject d = d(i);
        if (d instanceof TLRPC.Photo) {
            d = bc4.w(((TLRPC.Photo) d).sizes, gm.Y0(false), false, null, false);
        }
        return bc4.r(null, d);
    }

    @Override // mb8
    public final TLObject d(int i) {
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                return dy.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return dy.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // mb8
    public final boolean e(int i) {
        if (i < this.b.size() && i >= 0 && !dy.g(this.a, get(i))) {
            ey eyVar = this.c.v0[0].c;
            TL_iv.PageBlock pageBlock = get(i);
            eyVar.getClass();
            if (ey.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // mb8
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (w = bc4.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
                return null;
            }
            int i = w.size;
            iArr[0] = i;
            if (i == 0) {
                iArr[0] = -1;
            }
            return w;
        }
        TLRPC.PhotoSize w2 = bc4.w(((TLRPC.Photo) tLObject).sizes, gm.Y0(false), false, null, false);
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

    @Override // mb8
    public final Object g() {
        return this.a;
    }

    @Override // mb8
    public final TL_iv.PageBlock get(int i) {
        return (TL_iv.PageBlock) this.b.get(i);
    }

    @Override // mb8
    public final List getAll() {
        return this.b;
    }

    @Override // mb8
    public final void h(TL_iv.PageBlock pageBlock) {
        o oVar = this.c;
        int childCount = oVar.v0[0].b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = oVar.v0[0].b.getChildAt(i);
            if (childAt instanceof pw) {
                pw pwVar = (pw) childAt;
                int indexOf = pwVar.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    pwVar.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // mb8
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
                spannableStringBuilder.setSpan(new kx(this, str, objArr == true ? 1 : 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                o oVar = this.c;
                oVar.getClass();
                TL_iv.RichText t = o.t(2, pageBlock);
                CharSequence z = o.z(oVar, this.a, null, t, t, pageBlock, -gm.L(100.0f));
                if (!(z instanceof Spannable)) {
                    return z;
                }
                Spannable spannable = (Spannable) z;
                vjb[] vjbVarArr = (vjb[]) spannable.getSpans(0, z.length(), vjb.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(z.toString());
                if (vjbVarArr != null && vjbVarArr.length > 0) {
                    for (int i2 = 0; i2 < vjbVarArr.length; i2++) {
                        spannableStringBuilder2.setSpan(new kx(this, vjbVarArr[i2].b, (byte) 1), spannable.getSpanStart(vjbVarArr[i2]), spannable.getSpanEnd(vjbVarArr[i2]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // mb8
    public final int j() {
        return this.b.size();
    }
}
