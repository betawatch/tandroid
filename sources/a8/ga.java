package a8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class ga {
    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean a(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.ga.a(java.lang.String, java.lang.String):boolean");
    }

    public static boolean b(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String c(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (b(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (b(c10)) {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }
}
