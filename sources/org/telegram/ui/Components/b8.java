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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b8 extends vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public z7 f;
    public boolean h;
    public final /* synthetic */ c8 n;

    public b8(c8 c8Var, Context context) {
        this.n = c8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return (this.n.r0 && q1Var.b() == 0) ? false : true;
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
            z7 z7Var = new z7(this, str, 0);
            this.f = z7Var;
            dispatchQueue.postRunnable(z7Var, 300L);
        }
    }

    @Override // f2.r0
    public final int h() {
        int size;
        c8 c8Var = this.n;
        boolean z10 = c8Var.r0;
        if (c8Var.f) {
            size = this.d.size();
        } else {
            if (c8Var.t0.size() <= 1) {
                return 0;
            }
            size = c8Var.t0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return (this.n.r0 && i9 == 0) ? 1 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        c8 c8Var = this.n;
        View view = c8Var.e;
        i7 i7Var = c8Var.A;
        n7 n7Var = c8Var.n;
        if ((c8Var.t0.size() > 1) != this.h) {
            boolean z10 = c8Var.t0.size() > 1;
            this.h = z10;
            if (z10) {
                n7Var.setVisibility(0);
                n7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i9 = 0;
                n7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.y7
                    public final /* synthetic */ b8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i9) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).start();
            } else {
                final int i10 = 1;
                n7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.y7
                    public final /* synthetic */ b8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).withEndAction(new fg(this, 9)).start();
            }
        }
        if (c8Var.t0.size() > 1) {
            i7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            i7Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ri));
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, 0);
        }
        c8Var.v.setVisibility((c8Var.h && c8Var.s.h() == 0) ? 0 : 8);
        c8Var.D0();
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        c8 c8Var = this.n;
        if (c8Var.r0) {
            if (i9 == 0) {
                return;
            } else {
                i9--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) q1Var.a;
        if (c8Var.f) {
            messageObject = (MessageObject) this.d.get(i9);
        } else if (c8Var.s0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = c8Var.t0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i9) - 1);
        } else {
            messageObject = (MessageObject) c8Var.t0.get(i9);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        kh.r1 r1Var = c8Var.r0() ? new kh.r1(2, this, xVar) : null;
        int i10 = org.telegram.ui.ActionBar.f6.h5;
        b6Var = ((org.telegram.ui.ActionBar.f3) c8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        boolean r02 = c8Var.r0();
        fg.f fVar = (c8Var.r0() || c8Var.v0 || messageObject.getId() <= 0) ? null : new fg.f(this, xVar, messageObject, 20);
        RadialProgress2 radialProgress2 = xVar.D;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(r02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((r02 || fVar != null) ? 0 : 8);
        imageView.setOnClickListener(fVar);
        imageView.setOnTouchListener(r1Var);
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

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.c;
        if (i9 == 1) {
            an anVar = new an(context, 11);
            anVar.setTag(-33024);
            return new ik0(anVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        b6Var = ((org.telegram.ui.ActionBar.f3) this.n).resourcesProvider;
        return new ik0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, b6Var));
    }
}
