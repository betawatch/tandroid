package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a8 extends yk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public y7 f;
    public boolean h;
    public final /* synthetic */ b8 n;

    public a8(b8 b8Var, Context context) {
        this.n = b8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return (this.n.r0 && o1Var.b() == 0) ? false : true;
    }

    public final void E(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            l();
        } else {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            y7 y7Var = new y7(this, str, 0);
            this.f = y7Var;
            dispatchQueue.postRunnable(y7Var, 300L);
        }
    }

    @Override // f2.q0
    public final int h() {
        int size;
        b8 b8Var = this.n;
        boolean z10 = b8Var.r0;
        if (b8Var.f) {
            size = this.d.size();
        } else {
            if (b8Var.t0.size() <= 1) {
                return 0;
            }
            size = b8Var.t0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // f2.q0
    public final int j(int i10) {
        return (this.n.r0 && i10 == 0) ? 1 : 0;
    }

    @Override // f2.q0
    public final void l() {
        super.l();
        b8 b8Var = this.n;
        View view = b8Var.e;
        i7 i7Var = b8Var.A;
        n7 n7Var = b8Var.n;
        if ((b8Var.t0.size() > 1) != this.h) {
            boolean z10 = b8Var.t0.size() > 1;
            this.h = z10;
            if (z10) {
                n7Var.setVisibility(0);
                n7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                n7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.x7
                    public final /* synthetic */ a8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).start();
            } else {
                final int i11 = 1;
                n7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.x7
                    public final /* synthetic */ a8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i11) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).withEndAction(new bg(this, 9)).start();
            }
        }
        if (b8Var.t0.size() > 1) {
            i7Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            i7Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, 0);
        }
        b8Var.v.setVisibility((b8Var.h && b8Var.s.h() == 0) ? 0 : 8);
        b8Var.E0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r12 + 1) < r10.d.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0028, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        if (((r0.t0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.t0.size()) goto L11;
     */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        b8 b8Var = this.n;
        if (b8Var.r0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) o1Var.a;
        if (b8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (b8Var.s0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = b8Var.t0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) b8Var.t0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        lh.p1 p1Var = b8Var.s0() ? new lh.p1(2, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.g6.h5;
        c6Var = ((org.telegram.ui.ActionBar.e3) b8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        boolean s02 = b8Var.s0();
        gg.f fVar = (b8Var.s0() || b8Var.v0 || messageObject.getId() <= 0) ? null : new gg.f(this, xVar, messageObject, 20);
        RadialProgress2 radialProgress2 = xVar.D;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(s02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((s02 || fVar != null) ? 0 : 8);
        imageView.setOnClickListener(fVar);
        imageView.setOnTouchListener(p1Var);
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90) : null;
        if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = messageObject.getArtworkUrl(true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(artworkUrl);
            }
        }
        xVar.requestLayout();
        xVar.b(false, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        if (i10 == 1) {
            zm zmVar = new zm(context, 9);
            zmVar.setTag(-33024);
            return new lk0(zmVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        c6Var = ((org.telegram.ui.ActionBar.e3) this.n).resourcesProvider;
        return new lk0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, c6Var));
    }
}
