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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j9 extends Drawable {
    public final ViewGroup a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final vd.i c = new vd.i(new nh.d6(this, 6), jr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public j9(int i10, ViewGroup viewGroup, int i11, int i12, float f9) {
        this.b = i10;
        this.a = viewGroup;
        this.e = i11;
        this.f = i12;
        this.g = f9;
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
            i9 i9Var = (i9) obj;
            if (i9Var.c != 0 && !i9Var.d) {
                i9Var.d = true;
                i9Var.a.onAttachedToWindow();
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
                i9 i9Var = (i9) obj;
                if (i9Var.d) {
                    i9Var.d = false;
                    i9Var.a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.i == 0) {
            return;
        }
        float f9 = bounds.left;
        float f10 = bounds.top;
        vd.i iVar = this.c;
        canvas.saveLayer(f9, f10, f9 + iVar.d.f.a, f10 + this.e, null);
        for (int size = iVar.b.size() - 1; size >= 0; size--) {
            vd.f n10 = iVar.n(size);
            RectF b10 = n10.b();
            Object obj = n10.a;
            float f11 = n10.f.a;
            float c3 = n10.c();
            float f12 = b10.left + f11;
            float width = b10.width() - f11;
            float f13 = f9 + f12;
            float f14 = width / 2.0f;
            float f15 = f13 + f14;
            float f16 = f10 + f14;
            canvas.save();
            canvas.scale(c3, c3, f15, f16);
            canvas.drawCircle(f15, f16, f14 + this.g, org.telegram.ui.ActionBar.g6.Il);
            i9 i9Var = (i9) obj;
            i9Var.a.setImageCoords(f13, f10, width, width);
            i9Var.a.setAlpha((this.i / 255.0f) * n10.c());
            i9Var.a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        i9 i9Var;
        vd.i iVar = this.c;
        if (list == null || list.isEmpty()) {
            iVar.r(null, z10);
            return;
        }
        if (!z10) {
            iVar.r(null, false);
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
                    i9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                i9Var = (i9) obj;
                if (i9Var.c == peerDialogId) {
                    break;
                }
            }
            if (i9Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        i9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    i9Var = (i9) obj2;
                    if (i9Var.c == 0) {
                        break;
                    }
                }
            }
            if (i9Var == null) {
                i9Var = new i9(this, this.a);
                arrayList2.add(i9Var);
            }
            ImageReceiver imageReceiver = i9Var.a;
            e9 e9Var = i9Var.b;
            if (i9Var.c != peerDialogId) {
                i9Var.c = peerDialogId;
                int i12 = this.b;
                TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    e9Var.j(i12, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, e9Var);
                } else {
                    e9Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(i9Var);
            if (this.d && !i9Var.d) {
                i9Var.d = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        iVar.r(arrayList, z10);
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
