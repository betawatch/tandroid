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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g8 extends ll0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public e8 f;
    public boolean h;
    public final /* synthetic */ h8 n;

    public g8(h8 h8Var, Context context) {
        this.n = h8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return (this.n.v0 && c1Var.b() == 0) ? false : true;
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
            e8 e8Var = new e8(this, str, 0);
            this.f = e8Var;
            dispatchQueue.postRunnable(e8Var, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        int size;
        h8 h8Var = this.n;
        boolean z10 = h8Var.v0;
        if (h8Var.f) {
            size = this.d.size();
        } else {
            if (h8Var.x0.size() <= 1) {
                return 0;
            }
            size = h8Var.x0.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return (this.n.v0 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        h8 h8Var = this.n;
        View view = h8Var.e;
        n7 n7Var = h8Var.E;
        s7 s7Var = h8Var.n;
        if ((h8Var.x0.size() > 1) != this.h) {
            boolean z10 = h8Var.x0.size() > 1;
            this.h = z10;
            if (z10) {
                s7Var.setVisibility(0);
                s7Var.setTranslationY(AndroidUtilities.displaySize.y);
                final int i10 = 0;
                s7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.d8
                    public final /* synthetic */ g8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i10) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).start();
            } else {
                final int i11 = 1;
                s7Var.animate().translationY(AndroidUtilities.displaySize.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.d8
                    public final /* synthetic */ g8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ViewGroup viewGroup;
                        ViewGroup viewGroup2;
                        switch (i11) {
                            case 0:
                                viewGroup = ((org.telegram.ui.ActionBar.g3) this.b.n).containerView;
                                viewGroup.invalidate();
                                break;
                            default:
                                viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.b.n).containerView;
                                viewGroup2.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(qr.h).withEndAction(new ng(this, 9)).start();
            }
        }
        if (h8Var.x0.size() > 1) {
            n7Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, AndroidUtilities.dp(231.0f));
        } else {
            n7Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ri));
            view.setVisibility(0);
            s7Var.setPadding(0, s7Var.getPaddingTop(), 0, 0);
        }
        h8Var.v.setVisibility((h8Var.h && h8Var.s.h() == 0) ? 0 : 8);
        h8Var.E0();
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
    
        if (((r0.x0.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.x0.size()) goto L11;
     */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        h8 h8Var = this.n;
        if (h8Var.v0) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) c1Var.a;
        if (h8Var.f) {
            messageObject = (MessageObject) this.d.get(i10);
        } else if (h8Var.w0 == null ? !SharedConfig.playOrderReversed : SharedConfig.playOrderReversed) {
            ArrayList arrayList = h8Var.x0;
            messageObject = (MessageObject) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            messageObject = (MessageObject) h8Var.x0.get(i10);
        }
        if (messageObject != null) {
            messageObject.setQuery(this.e);
        }
        ci.q1 q1Var = h8Var.s0() ? new ci.q1(2, this, xVar) : null;
        int i11 = org.telegram.ui.ActionBar.j6.h5;
        f6Var = ((org.telegram.ui.ActionBar.g3) h8Var).resourcesProvider;
        xVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        boolean s02 = h8Var.s0();
        ai.d0 d0Var = (h8Var.s0() || h8Var.z0 || messageObject.getId() <= 0) ? null : new ai.d0(this, xVar, messageObject, 15);
        RadialProgress2 radialProgress2 = xVar.H;
        ImageView imageView = xVar.v;
        xVar.w = messageObject;
        if (xVar.x != z10) {
            xVar.invalidate();
        }
        xVar.x = z10;
        imageView.setImageResource(s02 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((s02 || d0Var != null) ? 0 : 8);
        imageView.setOnClickListener(d0Var);
        imageView.setOnTouchListener(q1Var);
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

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        if (i10 == 1) {
            kn knVar = new kn(context, 10);
            knVar.setTag(-33024);
            return new wk0(knVar);
        }
        boolean currentPlaylistIsGlobalSearch = MediaController.getInstance().currentPlaylistIsGlobalSearch();
        f6Var = ((org.telegram.ui.ActionBar.g3) this.n).resourcesProvider;
        return new wk0(new org.telegram.ui.Cells.x(context, currentPlaylistIsGlobalSearch ? 1 : 0, f6Var));
    }
}
