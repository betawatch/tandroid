package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                bn.md = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.bj) obj).d = f10;
                break;
            case 4:
                ((wv0) obj).setCrossfadeProgress(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                nz0 nz0Var = (nz0) obj;
                if (nz0Var.a != f10) {
                    nz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = nz0Var.r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (!nz0Var.b) {
                        if (nz0Var.c) {
                            nz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.Q.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.R.setPivotX(r4.getWidth());
                        secretMediaViewer.R.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.h61 h61Var = secretMediaViewer.P;
                        if (h61Var.y != f11) {
                            h61Var.y = f11;
                            h61Var.v.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.bj) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((nz0) obj).a);
        }
    }
}
