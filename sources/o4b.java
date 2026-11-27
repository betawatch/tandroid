// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o4b extends c79 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ s4b r;

    public o4b(s4b s4bVar, Context context) {
        this.r = s4bVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        return this.h;
    }

    @Override // j79
    public final int d(int i) {
        s4b s4bVar = this.r;
        if (s4bVar.Q1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i) ? 0 : 3;
        }
        Object obj = this.e.get(i);
        if (obj != null) {
            return !(obj instanceof TLRPC.Document) ? 2 : 0;
        }
        return 1;
    }

    @Override // j79
    public final void f() {
        int i;
        int i2;
        int i3;
        s4b s4bVar = this.r;
        if (s4bVar.Q1 != null) {
            int measuredWidth = s4bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = hl.q.x;
            }
            int L = measuredWidth / hl.L(72.0f);
            this.d = L;
            s4bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i4 = 0; i4 < s4bVar.Q1.size(); i4++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s4bVar.Q1.get(i4);
                List list = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i5 = this.h;
                    this.h = i5 + 1;
                    sparseArray.put(i5, Integer.valueOf(i4));
                    int i6 = this.h / this.d;
                    if (list.isEmpty()) {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i = 1;
                    } else {
                        i = (int) Math.ceil(list.size() / this.d);
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            sparseArray.put(this.h + i7, list.get(i7));
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        i2 = this.d * i;
                        i3 = this.h;
                        if (i8 >= i2) {
                            break;
                        }
                        sparseArray2.put(i3 + i8, stickerSetCovered);
                        i8++;
                    }
                    this.h = i2 + i3;
                }
            }
        } else {
            ArrayList arrayList = s4bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s4bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = s4bVar.M1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // j79
    public final void s(int i) {
        ArrayList arrayList = this.r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        s4b s4bVar = this.r;
        ArrayList arrayList = s4bVar.Q1;
        if (arrayList == null) {
            if (s4bVar.R1 != null) {
                ((x2b) view).setSticker((k7a) s4bVar.S1.get(i));
                return;
            }
            if (f89Var.f != 3) {
                x2b x2bVar = (x2b) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s4bVar.M1;
                if (tL_messages_stickerSet != null) {
                    x2bVar.d(tL_messages_stickerSet.documents.get(i), null, s4bVar.M1, null, s4bVar.b2, s4bVar.L1);
                    x2bVar.K.setOnClickListener(new jy8(this, x2bVar, (byte) 24));
                    return;
                }
                return;
            }
            return;
        }
        int i2 = f89Var.f;
        SparseArray sparseArray = this.e;
        if (i2 == 0) {
            ((x2b) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (i2 == 1) {
            ((t24) view).setHeight(hl.L(82.0f));
        } else if (i2 == 2) {
            ((h94) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        s4b s4bVar = this.r;
        Context context = this.c;
        if (i == 0) {
            n4b n4bVar = new n4b(this, context, s4bVar.J0);
            n4bVar.getImageView().m0(7);
            frameLayout = n4bVar;
        } else if (i == 1) {
            frameLayout = new t24(context);
        } else if (i == 2) {
            frameLayout = new h94(8, s4bVar.J0, this.c, true, false);
        } else if (i != 3) {
            frameLayout = null;
        } else {
            vnb vnbVar = s4bVar.J0;
            m4b m4bVar = new m4b(context);
            m4bVar.a = vnbVar;
            View view = new View(context);
            m4bVar.c = view;
            int L = hl.L(28.0f);
            int i2 = aob.Ef;
            ShapeDrawable b0 = aob.b0(L, aob.p1(0.12f, aob.v0(i2, vnbVar)));
            m4bVar.b = b0;
            Drawable e = c00.e(context, R.drawable.filled_add_sticker);
            yob.x(m4bVar, e, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
            zm2 zm2Var = new zm2(b0, e);
            int L2 = hl.L(56.0f);
            int L3 = hl.L(56.0f);
            zm2Var.h = L2;
            zm2Var.n = L3;
            int L4 = hl.L(24.0f);
            int L5 = hl.L(24.0f);
            zm2Var.e = L4;
            zm2Var.f = L5;
            view.setBackground(zm2Var);
            iye.a(view);
            m4bVar.addView(view, tre.e(56, 56, 17));
            frameLayout = m4bVar;
        }
        return new n69(frameLayout);
    }
}
