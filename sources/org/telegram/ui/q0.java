package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q0 extends org.telegram.ui.Components.k6 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i7) {
        super(str, 0);
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.k6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                cn.kd = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((org.telegram.messenger.ej) obj).d = f10;
                break;
            case 4:
                ((zv0) obj).setCrossfadeProgress(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                pz0 pz0Var = (pz0) obj;
                if (pz0Var.a != f10) {
                    pz0Var.a = f10;
                    SecretMediaViewer secretMediaViewer = pz0Var.r;
                    secretMediaViewer.Q.setAlpha(f10);
                    if (!pz0Var.b) {
                        if (pz0Var.c) {
                            pz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                        }
                        secretMediaViewer.P.setAlpha(f10);
                        break;
                    } else {
                        secretMediaViewer.Q.setPivotX(r4.getWidth());
                        secretMediaViewer.Q.setPivotY(r4.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.Q.setScaleX(f12);
                        secretMediaViewer.Q.setScaleY(f12);
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (v51Var.y != f11) {
                            v51Var.y = f11;
                            v51Var.v.invalidate();
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
                return Float.valueOf(cn.kd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.ej) obj).d);
            case 4:
                return Float.valueOf(((zv0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((pz0) obj).a);
        }
    }
}
