package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o9 extends Drawable {
    public final ViewGroup a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final me.j c = new me.j(new m2.t(this, 6), hs.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public o9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.b = i10;
        this.a = viewGroup;
        this.e = i11;
        this.f = i12;
        this.g = f7;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n9 n9Var = (n9) obj;
            if (n9Var.c != 0 && !n9Var.d) {
                n9Var.d = true;
                n9Var.a.onAttachedToWindow();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n9 n9Var = (n9) obj;
                if (n9Var.d) {
                    n9Var.d = false;
                    n9Var.a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f7 = bounds.left;
        float f10 = bounds.top;
        me.j jVar = this.c;
        canvas.saveLayer(f7, f10, f7 + jVar.d.f.a, f10 + this.e, null);
        for (int size = jVar.b.size() - 1; size >= 0; size--) {
            me.g n10 = jVar.n(size);
            RectF b10 = n10.b();
            Object obj = n10.a;
            float f11 = n10.f.a;
            float c10 = n10.c();
            float f12 = b10.left + f11;
            float width = b10.width() - f11;
            float f13 = f7 + f12;
            float f14 = width / 2.0f;
            float f15 = f13 + f14;
            float f16 = f10 + f14;
            canvas.save();
            canvas.scale(c10, c10, f15, f16);
            canvas.drawCircle(f15, f16, f14 + this.g, org.telegram.ui.ActionBar.i6.Ll);
            n9 n9Var = (n9) obj;
            n9Var.a.setImageCoords(f13, f10, width, width);
            n9Var.a.setAlpha((this.i / 255.0f) * n10.c());
            n9Var.a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        n9 n9Var;
        me.j jVar = this.c;
        if (list == null || list.isEmpty()) {
            jVar.r(null, z10);
            return;
        }
        if (!z10) {
            jVar.r(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    n9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                n9Var = (n9) obj;
                if (n9Var.c == peerDialogId) {
                    break;
                }
            }
            if (n9Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        n9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    n9Var = (n9) obj2;
                    if (n9Var.c == 0) {
                        break;
                    }
                }
            }
            if (n9Var == null) {
                n9Var = new n9(this, this.a);
                arrayList2.add(n9Var);
            }
            ImageReceiver imageReceiver = n9Var.a;
            j9 j9Var = n9Var.b;
            if (n9Var.c != peerDialogId) {
                n9Var.c = peerDialogId;
                int i12 = this.b;
                TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    j9Var.j(i12, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, j9Var);
                } else {
                    j9Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(n9Var);
            if (this.d && !n9Var.d) {
                n9Var.d = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        jVar.r(arrayList, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.i = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
