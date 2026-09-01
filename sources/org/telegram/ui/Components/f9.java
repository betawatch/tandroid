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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f9 extends Drawable {
    public final ViewGroup a;
    public final int b;
    public boolean d;
    public final int e;
    public final int f;
    public final float g;
    public final xd.h c = new xd.h(new androidx.biometric.f0(this, 25), pr.h, 380);
    public final ArrayList h = new ArrayList();
    public int i = 255;

    public f9(int i10, ViewGroup viewGroup, int i11, int i12, float f10) {
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
            e9 e9Var = (e9) obj;
            if (e9Var.c != 0 && !e9Var.d) {
                e9Var.d = true;
                e9Var.a.onAttachedToWindow();
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
                e9 e9Var = (e9) obj;
                if (e9Var.d) {
                    e9Var.d = false;
                    e9Var.a.onDetachedFromWindow();
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
        xd.h hVar = this.c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f.a, f11 + this.e, null);
        for (int size = hVar.b.size() - 1; size >= 0; size--) {
            xd.e n10 = hVar.n(size);
            RectF b10 = n10.b();
            Object obj = n10.a;
            float f12 = n10.f.a;
            float c3 = n10.c();
            float f13 = b10.left + f12;
            float width = b10.width() - f12;
            float f14 = f10 + f13;
            float f15 = width / 2.0f;
            float f16 = f14 + f15;
            float f17 = f11 + f15;
            canvas.save();
            canvas.scale(c3, c3, f16, f17);
            canvas.drawCircle(f16, f17, f15 + this.g, org.telegram.ui.ActionBar.k6.Il);
            e9 e9Var = (e9) obj;
            e9Var.a.setImageCoords(f14, f11, width, width);
            e9Var.a.setAlpha((this.i / 255.0f) * n10.c());
            e9Var.a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z4) {
        e9 e9Var;
        xd.h hVar = this.c;
        if (list == null || list.isEmpty()) {
            hVar.r(null, z4);
            return;
        }
        if (!z4) {
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
                    e9Var = null;
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                e9Var = (e9) obj;
                if (e9Var.c == peerDialogId) {
                    break;
                }
            }
            if (e9Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        e9Var = null;
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    e9Var = (e9) obj2;
                    if (e9Var.c == 0) {
                        break;
                    }
                }
            }
            if (e9Var == null) {
                e9Var = new e9(this, this.a);
                arrayList2.add(e9Var);
            }
            ImageReceiver imageReceiver = e9Var.a;
            z8 z8Var = e9Var.b;
            if (e9Var.c != peerDialogId) {
                e9Var.c = peerDialogId;
                int i12 = this.b;
                TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    z8Var.j(i12, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, z8Var);
                } else {
                    z8Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(e9Var);
            if (this.d && !e9Var.d) {
                e9Var.d = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        hVar.r(arrayList, z4);
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
