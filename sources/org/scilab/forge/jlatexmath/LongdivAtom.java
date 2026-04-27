package org.scilab.forge.jlatexmath;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LongdivAtom extends VRowAtom {
    public LongdivAtom(long j, long j2) {
        setHalign(1);
        setVtop(true);
        String[] makeResults = makeResults(j, j2);
        RuleAtom ruleAtom = new RuleAtom(1, 0.0f, 1, 2.6f, 1, 0.5f);
        for (int i = 0; i < makeResults.length; i++) {
            Atom atom = new TeXFormula(makeResults[i]).root;
            if (i % 2 == 0) {
                RowAtom rowAtom = new RowAtom(atom);
                rowAtom.add(ruleAtom);
                if (i == 0) {
                    append(rowAtom);
                } else {
                    append(new UnderlinedAtom(rowAtom));
                }
            } else if (i == 1) {
                String l = Long.toString(j);
                BigDelimiterAtom bigDelimiterAtom = new BigDelimiterAtom(SymbolAtom.get(TeXFormula.symbolMappings[41]), 1);
                RowAtom rowAtom2 = new RowAtom(new PhantomAtom(bigDelimiterAtom, false, true, true));
                rowAtom2.add(new SmashedAtom(new RaiseAtom(bigDelimiterAtom, 13, 3.5f, 13, 0.0f, 13, 0.0f)));
                rowAtom2.add(atom);
                OverlinedAtom overlinedAtom = new OverlinedAtom(rowAtom2);
                RowAtom rowAtom3 = new RowAtom(new TeXFormula(l).root);
                rowAtom3.add(new SpaceAtom(1));
                rowAtom3.add(overlinedAtom);
                append(rowAtom3);
            } else {
                RowAtom rowAtom4 = new RowAtom(atom);
                rowAtom4.add(ruleAtom);
                append(rowAtom4);
            }
        }
    }

    private String[] makeResults(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = j2 / j;
        arrayList.add(Long.toString(j3));
        arrayList.add(Long.toString(j2));
        while (j3 != 0) {
            double d = j3;
            double pow = Math.pow(10.0d, Math.floor(Math.log10(d)));
            long floor = (long) (Math.floor(d / pow) * pow);
            long j4 = floor * j;
            arrayList.add(Long.toString(j4));
            j2 -= j4;
            arrayList.add(Long.toString(j2));
            j3 -= floor;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
