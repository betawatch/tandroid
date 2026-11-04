package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ml implements hq0 {
    public final TL_iv.RichMessage a;
    public final ArrayList b;
    public final org.telegram.messenger.zi c;

    public ml(TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.messenger.zi ziVar) {
        this.a = richMessage;
        this.b = arrayList;
        this.c = ziVar;
    }

    @Override // org.telegram.ui.hq0
    public final boolean a(int i3) {
        if (i3 < 0) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (i3 >= arrayList.size()) {
            return false;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
        if (!(pageBlock instanceof TL_iv.pageBlockVideo)) {
            return false;
        }
        TLRPC.Document b10 = e4.b(this.a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        if (b10 != null) {
            return org.telegram.messenger.zi.L4(b10);
        }
        return false;
    }

    @Override // org.telegram.ui.hq0
    public final File b(int i3) {
        TLRPC.Document b10;
        TLRPC.PhotoSize w10;
        if (i3 >= 0) {
            ArrayList arrayList = this.b;
            if (i3 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.a;
                if (z10) {
                    TLRPC.Photo f10 = e4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (w10 = org.telegram.messenger.w7.w(f10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                        return e4.c(w10);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = e4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return e4.c(b10);
                }
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
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i3 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i3);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.a;
        if (z10) {
            return e4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return e4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        }
        return null;
    }

    @Override // org.telegram.ui.hq0
    public final boolean e(int i3) {
        return false;
    }

    @Override // org.telegram.ui.hq0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 == null) {
                iArr[0] = -1;
                return null;
            }
            int i3 = w10.size;
            iArr[0] = i3;
            if (i3 == 0) {
                iArr[0] = -1;
            }
            return w10;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.hs.r5, false, null, true);
            if (w11 == null) {
                w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            }
            if (w11 != null) {
                int i10 = w11.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w11;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override // org.telegram.ui.hq0
    public final Object g() {
        org.telegram.messenger.zi ziVar = this.c;
        return ziVar != null ? ziVar : this.a;
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
        org.telegram.messenger.cv cvVar;
        org.telegram.messenger.zi ziVar = this.c;
        if (ziVar == null || (cvVar = ziVar.w2) == null) {
            return;
        }
        ArrayList arrayList = cvVar.g;
        if (pageBlock == null) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList.get(i3);
            if (xtVar instanceof org.telegram.messenger.ou) {
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) xtVar;
                ArrayList arrayList2 = ouVar.Y;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((org.telegram.messenger.qt) arrayList2.get(i10)).b == pageBlock) {
                        int max = Math.max(0, Math.min(i10, arrayList2.size() - 1));
                        ValueAnimator valueAnimator = ouVar.l0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            ouVar.l0 = null;
                        }
                        if (ouVar.b0 == max && ouVar.c0 == 0.0f) {
                            return;
                        }
                        ouVar.b0 = max;
                        ouVar.c0 = 0.0f;
                        ouVar.d0 = false;
                        ouVar.e0 = false;
                        View view = ouVar.W;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.hq0
    public final CharSequence i(int i3) {
        return null;
    }

    @Override // org.telegram.ui.hq0
    public final int j() {
        return this.b.size();
    }
}
