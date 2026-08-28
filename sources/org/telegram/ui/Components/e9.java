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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e9 extends Drawable {
    public final ViewGroup a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final td.h c = new td.h(new n5.a0(this, 6), gr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public e9(int i9, ViewGroup viewGroup, int i10, int i11, float f10) {
        this.b = i9;
        this.a = viewGroup;
        this.e = i10;
        this.f = i11;
        this.g = f10;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            d9 d9Var = (d9) obj;
            if (d9Var.c != 0 && !d9Var.d) {
                d9Var.d = true;
                d9Var.a.onAttachedToWindow();
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                d9 d9Var = (d9) obj;
                if (d9Var.d) {
                    d9Var.d = false;
                    d9Var.a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f10 = bounds.left;
        float f11 = bounds.top;
        td.h hVar = this.c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f.a, f11 + this.e, null);
        for (int size = hVar.b.size() - 1; size >= 0; size--) {
            td.e n10 = hVar.n(size);
            RectF b10 = n10.b();
            Object obj = n10.a;
            float f12 = n10.f.a;
            float c10 = n10.c();
            float f13 = b10.left + f12;
            float width = b10.width() - f12;
            float f14 = f10 + f13;
            float f15 = width / 2.0f;
            float f16 = f14 + f15;
            float f17 = f11 + f15;
            canvas.save();
            canvas.scale(c10, c10, f16, f17);
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.f6.Il);
            d9 d9Var = (d9) obj;
            d9Var.a.setImageCoords(f14, f11, width, width);
            d9Var.a.setAlpha((this.i / 255.0f) * n10.c());
            d9Var.a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        d9 d9Var;
        td.h hVar = this.c;
        if (list == null || list.isEmpty()) {
            hVar.r(null, z10);
            return;
        }
        if (!z10) {
            hVar.r(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    d9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i9);
                i9++;
                d9Var = (d9) obj;
                if (d9Var.c == peerDialogId) {
                    break;
                }
            }
            if (d9Var == null) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        d9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    d9Var = (d9) obj2;
                    if (d9Var.c == 0) {
                        break;
                    }
                }
            }
            if (d9Var == null) {
                d9Var = new d9(this, this.a);
                arrayList2.add(d9Var);
            }
            ImageReceiver imageReceiver = d9Var.a;
            z8 z8Var = d9Var.b;
            if (d9Var.c != peerDialogId) {
                d9Var.c = peerDialogId;
                int i11 = this.b;
                TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    z8Var.j(i11, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, z8Var);
                } else {
                    z8Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(d9Var);
            if (this.d && !d9Var.d) {
                d9Var.d = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        hVar.r(arrayList, z10);
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
    public final void setAlpha(int i9) {
        this.i = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
