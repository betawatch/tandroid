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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d9 extends Drawable {
    public final ViewGroup a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final ud.h c = new ud.h(new n2.b0(this, 8), er.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public d9(int i10, ViewGroup viewGroup, int i11, int i12, float f10) {
        this.b = i10;
        this.a = viewGroup;
        this.e = i11;
        this.f = i12;
        this.g = f10;
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
            c9 c9Var = (c9) obj;
            if (c9Var.c != 0 && !c9Var.d) {
                c9Var.d = true;
                c9Var.a.onAttachedToWindow();
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
                c9 c9Var = (c9) obj;
                if (c9Var.d) {
                    c9Var.d = false;
                    c9Var.a.onDetachedFromWindow();
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
        ud.h hVar = this.c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f.a, f11 + this.e, null);
        for (int size = hVar.b.size() - 1; size >= 0; size--) {
            ud.e n10 = hVar.n(size);
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
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.g6.Il);
            c9 c9Var = (c9) obj;
            c9Var.a.setImageCoords(f14, f11, width, width);
            c9Var.a.setAlpha((this.i / 255.0f) * n10.c());
            c9Var.a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        c9 c9Var;
        ud.h hVar = this.c;
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
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                c9Var = (c9) obj;
                if (c9Var.c == peerDialogId) {
                    break;
                }
            }
            if (c9Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        c9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    c9Var = (c9) obj2;
                    if (c9Var.c == 0) {
                        break;
                    }
                }
            }
            if (c9Var == null) {
                c9Var = new c9(this, this.a);
                arrayList2.add(c9Var);
            }
            ImageReceiver imageReceiver = c9Var.a;
            y8 y8Var = c9Var.b;
            if (c9Var.c != peerDialogId) {
                c9Var.c = peerDialogId;
                int i12 = this.b;
                TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    y8Var.j(i12, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, y8Var);
                } else {
                    y8Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(c9Var);
            if (this.d && !c9Var.d) {
                c9Var.d = true;
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
    public final void setAlpha(int i10) {
        this.i = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
